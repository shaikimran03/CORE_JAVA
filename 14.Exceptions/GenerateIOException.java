// * 12. Write a program to generate IOException
public class GenerateIOException {

    public static void main(String[] args) {
        try {
            // Attempting to read from a file that doesn't exist
            java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt");
            int data = file.read();
            System.out.println((char) data);
            file.close();
        } catch (java.io.IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}