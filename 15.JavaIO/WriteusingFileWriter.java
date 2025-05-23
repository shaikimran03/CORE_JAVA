// * 6.Write a program to write text to .txt file using FileWriter

import java.io.FileWriter;
import java.io.IOException;

public class WriteusingFileWriter {
public static void main(String[] args) {
        String content = "Hello, this text is written using FileWriter!";

        FileWriter writer = null;

        try {
            // Create a FileWriter object (will overwrite existing file)
            writer = new FileWriter("filewriter.txt");

            // Write the string to the file
            writer.write(content);

            System.out.println("Data written successfully to filewriter.txt");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Always close the writer
                }
            } catch (IOException e) {
                System.out.println("Error closing writer: " + e.getMessage());
            }
        }
    }
    
}