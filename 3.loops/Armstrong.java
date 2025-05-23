import java.util.Scanner;

public class Armstrong {   

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;
        int n = 0;

        // Count the number of digits
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            n++;
        }

        // Calculate sum of digits raised to the power n
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, n);
            temp /= 10;
        }

        // Check if Armstrong
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }

        scanner.close();
    }
}