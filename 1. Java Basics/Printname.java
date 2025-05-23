import java.util.Scanner;

public class Printname {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read the full line (allows spaces)

        // Print the name
        System.out.println("Your name is: " + name);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
 
