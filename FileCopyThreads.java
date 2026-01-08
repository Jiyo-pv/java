import java.io.*;

class FileCopyThread extends Thread {

    static int tcount = 0;
    File source;
    File dest;

    FileCopyThread(File s, File d) {
        source = s;
        dest = d;
        tcount++;
        setName("FileCopyThread-" + tcount);
        start();
    }

    public void run() {
        copyFiles(source, dest);   // ✅ FIXED
    }

    public void copyFiles(File sourceFile, File destFile) {

        if (sourceFile.isDirectory()) {
            destFile.mkdir();
            File[] files = sourceFile.listFiles();

            for (File f : files) {
                File dst = new File(destFile, f.getName());

                // 🔥 create new thread for subfiles also
                new FileCopyThread(f, dst);
            }
        } else {
            try {
                FileInputStream fin = new FileInputStream(sourceFile);
                FileOutputStream fout = new FileOutputStream(destFile);

                int ch;
                while ((ch = fin.read()) != -1) {
                    fout.write(ch);
                }

                fin.close();
                fout.close();

                System.out.println(getName() + " copied " + sourceFile.getName());

            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class FileCopyThreads {
    public static void main(String args[]) {

        File source = new File("C:\\Users\\jiyop\\java\\a");
        File destRoot = new File("C:\\Users\\jiyop\\java\\b");

        File[] files = source.listFiles();

        for (File f : files) {
            File dest = new File(destRoot, f.getName());
            new FileCopyThread(f, dest);
        }
    }
}
