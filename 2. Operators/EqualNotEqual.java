import java.util.Scanner;

public class EqualNotEqual {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Check equality
        if (num1 == num2) {
            System.out.println("The two numbers are equal.");
        } else {
            System.out.println("The two numbers are not equal.");
        }

        // Demonstrating not equal operator
        if (num1 != num2) {
            System.out.println("Confirmed using != operator: Numbers are not equal.");
        } else {
            System.out.println("Confirmed using != operator: Numbers are equal.");
        }

        scanner.close();
    }
}
