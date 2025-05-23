//12. Write a method to remove duplicate elements from an array 
//18. Write a program to remove the duplicate elements and return the new array 
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveduplicateElements {
    



    // Method to remove duplicates and return new array
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : array) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
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

        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueNumbers));

        scanner.close();
    }
}

