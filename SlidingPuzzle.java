import java.util.Scanner;

/*
15 puzzle game 
@JIYO P V  Roll No:33
06 December 2025
*/

public class SlidingPuzzle {

    // Swaps the blank tile with another tile at (row, col)
    static void swap(int[][] a, int pos_r, int pos_c, int row, int col) {
        int temp = a[row][col];
        a[row][col] = a[pos_r][pos_c];
        a[pos_r][pos_c] = temp;
    }

    // Checks whether the puzzle is solved (1 to 15 and 0 at the end)
    static boolean checkStatus(int[][] a) {
        int status = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // If any value is not in correct sequence, puzzle is not solved
                if (a[i][j] != status % 16) {
                    return false;
                }
                status++;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][4]; // Main board for gameplay

        // Predefined easy board
        int[][] easy = {
                {1, 2, 7, 3},
                {5, 6, 11, 4},
                {9, 10, 15, 8},
                {13, 14, 12, 0}
        };

        // Predefined normal board
        int[][] normal = {
                {1, 2, 3, 4},
                {5, 6, 8, 7},
                {9, 10, 12, 11},
                {14, 15, 13, 0}
        };

        // Predefined hard board
        int[][] hard = {
                {5, 9, 11, 10},
                {13, 6, 2, 3},
                {1, 7, 14, 4},
                {8, 12, 15, 0}
        };

        // MENU
        System.out.println("\t\tSLIDING PUZZLE");
        System.out.println("Choose difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("3. Hard");
        System.out.print("-> ");
        int mode = sc.nextInt(); // Difficulty choice

        // Number of players
        System.out.print("Enter number of players: ");
        int n = sc.nextInt();

        String[] name = new String[n]; // Player names
        int[] moves = new int[n];      // Moves for each player

        // Taking names of all players
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of player " + (i + 1) + ": ");
            name[i] = sc.next();
        }

        sc.nextLine(); // Clear newline after nextInt()

        // Gameplay loop for each player
        for (int player = 0; player < n; player++) {

            // Copy selected puzzle into main board
            if (mode == 1) {
                for (int i = 0; i < 4; i++)
                    System.arraycopy(easy[i], 0, a[i], 0, 4);
            } else if (mode == 2) {
                for (int i = 0; i < 4; i++)
                    System.arraycopy(normal[i], 0, a[i], 0, 4);
            } else {
                for (int i = 0; i < 4; i++)
                    System.arraycopy(hard[i], 0, a[i], 0, 4);
            }

            int pos_r = 3, pos_c = 3; // Blank tile starting position (3,3)
            char ch;

            do {
                // Clear screen using escape sequence
                System.out.print("\033[H\033[2J");
                System.out.flush();

                System.out.println("\t\tSLIDING PUZZLE");
                System.out.println("Player: " + name[player]);

                // Print current board
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print((a[i][j] == 0 ? "0" : a[i][j]) + "\t");
                    }
                    System.out.println();
                }

                // Player input
                System.out.println("Move: w=up s=down a=left d=right 0=exit");
                System.out.print("-> ");

                // Read movement key
                ch = sc.nextLine().charAt(0);

                // Move blank tile according to user input
                switch (ch) {
                    case 'w': // Move up
                        if (pos_r > 0) {
                            swap(a, pos_r, pos_c, pos_r - 1, pos_c);
                            pos_r--;
                            moves[player]++;
                        }
                        break;

                    case 's': // Move down
                        if (pos_r < 3) {
                            swap(a, pos_r, pos_c, pos_r + 1, pos_c);
                            pos_r++;
                            moves[player]++;
                        }
                        break;

                    case 'a': // Move left
                        if (pos_c > 0) {
                            swap(a, pos_r, pos_c, pos_r, pos_c - 1);
                            pos_c--;
                            moves[player]++;
                        }
                        break;

                    case 'd': // Move right
                        if (pos_c < 3) {
                            swap(a, pos_r, pos_c, pos_r, pos_c + 1);
                            pos_c++;
                            moves[player]++;
                        }
                        break;

                    case '0': // Exit game
                        System.out.println("Game aborted.");
                        return;

                    default:
                        continue; // Ignore invalid keys
                }

                // Check if puzzle solved
                if (checkStatus(a)) {
                    System.out.println("Puzzle Solved!");
                    break;
                }

            } while (ch != '0');
        }

        // Display score board
        System.out.println("\n_____________________________");
        System.out.println("         SCORE BOARD");
        System.out.println("-----------------------------");
        System.out.println("Player Name      Moves");
        System.out.println("-----------------------------");

        // Find winner (least moves)
        int winner = 0;
        for (int i = 1; i < n; i++) {
            if (moves[i] < moves[winner])
                winner = i;
        }

        // Print summary for all players
        for (int i = 0; i < n; i++) {
            System.out.println(name[i] + "\t   " + moves[i] +
                    ((i == winner) ? " (winner)" : ""));
        }
    }
}
