// * 19. Write a function to find the missing number of sorted array of 1 to 100

import java.util.Arrays;

public class MissingNumber {

    

    // Method to find missing numbers from 1 to 100 in the sorted array
    static void missingNumbers(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Input array: " + Arrays.toString(arr));

        int j = 0;
        System.out.print("Missing numbers: ");
        for (int i = 1; i <= 100; i++) {
            if (j < arr.length && i == arr[j]) {
                j++;
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example array with some numbers between 1 and 100
        int[] my_arr = {2, 33, 43, 54, 55, 66, 77, 88, 91};
        missingNumbers(my_arr);
    }
}


