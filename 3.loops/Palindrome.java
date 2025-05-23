import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove spaces and convert to lowercase for uniformity
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the string
        for (int i = cleanedInput.length() - 1; i >= 0; i--) {
            reversed += cleanedInput.charAt(i);
        }

        // Check if palindrome
        if (cleanedInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}


