//15. Write a method to find number of even number and odd numbers in an array
import java.util.Scanner;
public class Evenoddnumbers {
    



    // Method to count even and odd numbers
    public static void countEvenOdd(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    // Main method with Scanner input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        countEvenOdd(numbers);

        scanner.close();
    }
}

