import java.util.Scanner;

public class SmallerLarger{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Compare numbers and print smaller and larger
        if (num1 > num2) {
            System.out.println("Larger number: " + num1);
            System.out.println("Smaller number: " + num2);
        } else if (num2 > num1) {
            System.out.println("Larger number: " + num2);
            System.out.println("Smaller number: " + num1);
        } else {
            System.out.println("Both numbers are equal.");
        }

        scanner.close();
    }
}
