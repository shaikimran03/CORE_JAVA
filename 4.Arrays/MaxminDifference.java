//8. Write a function to find the minimum and maximum value of an array 

import java.util.Scanner;

public class MaxminDifference {
    

    // Method to find min and max values in the array
    public static void findMinMax(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty.");
            return;
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

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
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

        findMinMax(numbers);

        scanner.close();
    }
}

