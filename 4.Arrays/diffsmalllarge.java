// * 16. Write a function to get the difference of largest and smallest value

import java.util.Scanner;

public class diffsmalllarge {


    // Method to calculate difference between largest and smallest values
    public static int differenceMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return 0; // or throw exception based on your requirement
        }

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
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

        int difference = differenceMinMax(numbers);
        System.out.println("Difference between largest and smallest value: " + difference);

        scanner.close();
    }
}








