 // * 11.Write a program to generate FileNotFoundException

 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFound {
   

    public static void main(String[] args) {
        File file = new File("nonexistentfile.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

