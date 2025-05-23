// * 5.Write a function to remove a specific element from an array
import java.util.Arrays;
import java.util.Scanner;
public class RemoveElementfromArray {
    



    // Method to remove a specific element from the array
    public static int[] removeElement(int[] array, int element) {
        int count = 0;

        // Count occurrences of element to remove
        for (int num : array) {
            if (num == element) {
                count++;
            }
        }

        // If element not found, return original array
        if (count == 0) {
            return array;
        }

        int[] result = new int[array.length - count];
        int index = 0;

        for (int num : array) {
            if (num != element) {
                result[index++] = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to remove: ");
        int elementToRemove = scanner.nextInt();

        int[] updatedArray = removeElement(numbers, elementToRemove);

        System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(updatedArray));

        scanner.close();
    }
}

