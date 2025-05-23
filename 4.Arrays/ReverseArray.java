//9. Write a function to reverse an array of integer values
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    




    // Function to reverse the array in place
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
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

        reverseArray(numbers);

        System.out.println("Reversed array: " + Arrays.toString(numbers));

        scanner.close();
    }
}

