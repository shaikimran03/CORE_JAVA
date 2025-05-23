// * 8.Write text to a .txt file using BufferedWriter

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteusingBufferedWriter {

     public static void main(String[] args) {
        String content = "Hello, this text is written using BufferedWriter!\nThis is line 2.";

        BufferedWriter writer = null;

        try {
            // Create a BufferedWriter connected to FileWriter
            writer = new BufferedWriter(new FileWriter("Bufferedoutput.txt"));

            // Write content to the file
            writer.write(content);
            writer.newLine(); // Optional: adds a new line
            writer.write("This is another line using writer.write().");

            System.out.println("Data written successfully to Bufferedoutput.txt");

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