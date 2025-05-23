// * 5.Write a program to read text from .txt file using FileReader

import java.io.FileReader;
import java.io.IOException;
public class ReadusingFilereader {

   
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            // Specify your file path here
            reader = new FileReader("fr.txt");

            int data;
            System.out.println("File content:");
            while ((data = reader.read()) != -1) {
                System.out.print((char) data); // Convert int to char
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close(); // Always close the reader
                }
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}

