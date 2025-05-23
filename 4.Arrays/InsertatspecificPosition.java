// * 7. Write a function to insert an element at a specific position in the array.
import java.util.Scanner;
import java.util.Arrays;
public class InsertatspecificPosition {

    


    // Method to insert element at specific position
    public static int[] insertAtPosition(int[] array, int element, int position) {
        if (position < 0 || position > array.length) {
            System.out.println("Invalid position!");
            return array; // Return original array if position is invalid
        }

        int[] newArray = new int[array.length + 1];

        // Copy elements before the position
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element
        newArray[position] = element;

        // Copy remaining elements after position
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
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

        System.out.print("Enter element to insert: ");
        int element = scanner.nextInt();

        System.out.print("Enter position to insert element (0-based index): ");
        int position = scanner.nextInt();

        int[] updatedArray = insertAtPosition(numbers, element, position);

        System.out.println("Array after insertion: " + Arrays.toString(updatedArray));

        scanner.close();
    }
}
