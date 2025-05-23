// * 2.Write a program to write text to .txt file using OutputStream

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteusingOutputStream {

    public static void main(String[] args) {
        String content = "Hello, this text is written using OutputStream!";

        OutputStream outputStream = null;

        try {
            // Create FileOutputStream to write to a file
            outputStream = new FileOutputStream("outputstream.txt");

            // Convert the string into bytes
            byte[] data = content.getBytes();

            // Write bytes to the file
            outputStream.write(data);

            System.out.println("Data written successfully to outputstream.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close(); // Always close the stream
                }
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}