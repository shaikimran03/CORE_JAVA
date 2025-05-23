// * 3.Read text from a .txt file using BufferedInputStream

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadusingBufferedInputStream {

       public static void main(String[] args) {
        BufferedInputStream bis = null;

        try {
            // Specify your file path here
            FileInputStream fis = new FileInputStream("bis.txt");
            bis = new BufferedInputStream(fis);

            int data;
            System.out.println("File content:");
            while ((data = bis.read()) != -1) {
                System.out.print((char) data); // Convert byte to char for display
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (bis != null) {
                    bis.close(); // Close BufferedInputStream which also closes FileInputStream
                }
            } catch (IOException e) {
                System.out.println("Error closing stream: " + e.getMessage());
            }
        }
    }
}