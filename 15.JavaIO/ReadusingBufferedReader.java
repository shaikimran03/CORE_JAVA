// * 7.Read text from a .txt file using BufferedReader
import java.io.BufferedReader;
import java.io.FileReader;  
import java.io.IOException;
public class ReadusingBufferedReader {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Specify your file path here
            reader = new BufferedReader(new FileReader("br.txt"));

            String line;
            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line
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

    
