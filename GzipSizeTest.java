import java.io.*;
import java.util.zip.GZIPOutputStream;

public class GzipSizeTest {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java GzipPercentage <filename>");
            return;
        }

        String inputFile = args[0];
        String outputFile = inputFile + ".gz";

        File inFile = new File(inputFile);
        if (!inFile.exists()) {
            System.out.println("File does not exist: " + inputFile);
            return;
        }

        long originalSize = inFile.length();

        // Compress
        try (
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);
            GZIPOutputStream gzipOut = new GZIPOutputStream(fos)
        ) {
            byte[] buffer = new byte[1024];
            int len;

            while ((len = fis.read(buffer)) > 0) {
                gzipOut.write(buffer, 0, len);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Compare sizes
        long compressedSize = new File(outputFile).length();

        System.out.println("Original size:   " + originalSize + " bytes");
        System.out.println("Compressed size: " + compressedSize + " bytes");

        // Calculate percentage difference
        double change = ((double) (originalSize - compressedSize) / originalSize) * 100;

        if (change > 0) {
            System.out.printf("File shrunk by:  %.2f%%\n", change);
        } else if (change < 0) {
            System.out.printf("File grew by:    %.2f%%\n", -change);
        } else {
            System.out.println("No size change.");
        }
    }
}
