import java.util.Scanner;

public class logical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Logical AND: Check if number is between 10 and 100
        if (number >= 10 && number <= 100) {
            System.out.println("The number is between 10 and 100 (inclusive).");
        } else {
            System.out.println("The number is NOT between 10 and 100.");
        }

        // Logical OR: Check if number is less than 0 or greater than 100
        if (number < 0 || number > 100) {
            System.out.println("The number is either less than 0 or greater than 100.");
        } else {
            System.out.println("The number is between 0 and 100 (inclusive).");
        }

        // Logical NOT: Check if the number is NOT zero
        if (!(number == 0)) {
            System.out.println("The number is NOT zero.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}
