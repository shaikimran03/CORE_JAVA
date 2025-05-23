// * 1.Write a program to read text from .txt file using InputStream

import java.io.FileInputStream;
import java.io.IOException;

public class ReadusingInputStream {

     public static void main(String[] args) {
        FileInputStream inputStream = null;

        try {
            // Specify the file path (make sure the file exists)
            inputStream = new FileInputStream("IS.txt");

            int byteData;
            System.out.println("File content:");
            while ((byteData = inputStream.read()) != -1) {
                System.out.print((char) byteData);  // Convert byte to character
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close(); // Always close the stream
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}