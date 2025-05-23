import java.util.HashSet;
import java.util.Set;
public class Commonvaluesintwoarrays {
    



    // Function to find common elements between two arrays
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        // Add all elements from the first array to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check for common elements in the second array
        for (int num : array2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        return common;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] array1 = {111, 222, 333, 544, 6545};
        int[] array2 = {544, 6545, 666, 111, 88};

        Set<Integer> commonValues = findCommonElements(array1, array2);

        System.out.println("Common values between the two arrays: " + commonValues);
    }
}

