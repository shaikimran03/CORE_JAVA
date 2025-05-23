//10.Write a function to find the duplicate values of an array
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class dupliactevalue {
    


    // Function to find and print duplicate values in an array
    public static void findDuplicates(int[] array) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println("Duplicate values: " + duplicates);
        }
    }

    // Main method to get input using Scanner and call the function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        findDuplicates(numbers);
        scanner.close();
    }
}

