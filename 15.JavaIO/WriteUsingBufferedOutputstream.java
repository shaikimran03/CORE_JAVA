// * 4.Write text to a .txt file using BufferedOutputStream

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputstream {

    public static void main(String[] args) {
        String content = "Hello, this text is written using BufferedOutputStream!";
        BufferedOutputStream bos = null;

        try {
            // Create a FileOutputStream to write to a file
            FileOutputStream fos = new FileOutputStream("Bufferedoutput.txt");
            bos = new BufferedOutputStream(fos);

            // Convert string to bytes and write
            bos.write(content.getBytes());
            bos.flush(); // Ensure all data is written to file

            System.out.println("Data written successfully to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (bos != null) {
                    bos.close(); // Always close the stream
                }
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}