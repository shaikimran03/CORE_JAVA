//Write a program to find the index of an array element.
import java.util.Scanner;

public class Findindex {
    


    // Method to find the index of an element in the array
    public static int findIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the first matching index
            }
        }
        return -1; // Return -1 if not found
    }

    // Main method using Scanner for input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to find its index: ");
        int valueToFind = scanner.nextInt();

        int index = findIndex(numbers, valueToFind);

        if (index != -1) {
            System.out.println("Element " + valueToFind + " found at index: " + index);
        } else {
            System.out.println("Element " + valueToFind + " not found in the array.");
        }

        scanner.close();
    }
}

