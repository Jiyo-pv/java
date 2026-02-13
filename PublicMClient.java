import java.io.*;
import java.net.*;
import java.util.*;

class PublicMClient {

    static final String GREEN = "\u001B[32m";
    static final String RED = "\u001B[31m";
    static final String RESET = "\u001B[0m";

    static String serverName = "PUBLIC CHAT SERVER";
    static String userCount = "Users Online: 0";

    static List<String> chatLog = new ArrayList<>();

    public static void main(String args[]) {
        try {
            Socket cs = new Socket("192.168.20.113", 1234);

            DataInputStream sin = new DataInputStream(cs.getInputStream());
            DataOutputStream sout = new DataOutputStream(cs.getOutputStream());
            BufferedReader kin = new BufferedReader(new InputStreamReader(System.in));

            redrawScreen();

            // RECEIVE THREAD
            Thread receive = new Thread(() -> {
                try {
                    while (true) {
                        String msg = sin.readUTF();

                        // UPDATE USER COUNT
                        if (msg.startsWith("SERVER_STATUS:")) {
                            userCount = msg.replace("SERVER_STATUS:", "").trim();
                        }

                        // JOIN MESSAGE (GREEN CENTER)
                        else if (msg.contains("joined the chat")) {
                            chatLog.add(centerText(GREEN + msg + RESET));
                        }

                        // LEAVE MESSAGE (RED CENTER)
                        else if (msg.contains("left the chat")) {
                            chatLog.add(centerText(RED + msg + RESET));
                        }

                        // NORMAL MESSAGE
                        else {
                            if (msg.startsWith("LEFT:")) {
                                msg = msg.substring(5);
                            }
                            chatLog.add(msg);
                        }

                        redrawScreen();
                    }
                } catch (Exception e) {}
            });
            receive.start();

            // FORCE NAME INPUT
            String name = "";
            while (name.trim().isEmpty()) {
                System.out.print("Enter your name: ");
                name = kin.readLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Name cannot be empty.");
                }
            }

            sout.writeUTF(name);

            // SEND LOOP
            while (true) {
                String msg = kin.readLine();
                sout.writeUTF(msg);

                if (msg.equalsIgnoreCase("quit"))
                    break;
            }

            cs.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // CLEAR + REDRAW SCREEN
    static void redrawScreen() {
        clearScreen();
        drawHeader();
        drawChat();
        drawFooter();
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // HEADER
    static void drawHeader() {
        System.out.println("==============================================================");
        System.out.println(serverName);
        System.out.println("==============================================================\n");
    }

    // CHAT LOG
    static void drawChat() {
        for (String line : chatLog) {
            System.out.println(line);
        }
    }

    // FOOTER (BOTTOM RIGHT USERS)
    static void drawFooter() {
        int width = 80;
        int spaces = width - userCount.length();
        if (spaces < 0) spaces = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < spaces; i++) sb.append(" ");

        System.out.println("\n" + sb.toString() + userCount);
    }

    // CENTER JOIN/LEAVE
    static String centerText(String text) {
        int width = 80;
        int pad = (width - text.length()) / 2;
        if (pad < 0) pad = 0;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pad; i++) sb.append(" ");

        return sb.toString() + text;
    }
}