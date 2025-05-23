public class ContainspecificElements {
    

    // Method to verify if the array contains both 12 and 23
    public static boolean containsElements(int[] array, int elem1, int elem2) {
        boolean foundElem1 = false;
        boolean foundElem2 = false;

        for (int num : array) {
            if (num == elem1) {
                foundElem1 = true;
            }
            if (num == elem2) {
                foundElem2 = true;
            }
            // Exit early if both are found
            if (foundElem1 && foundElem2) {
                return true;
            }
        }

        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] numbers = {5, 12, 7, 9, 23, 30};

        boolean result = containsElements(numbers, 12, 23);

        if (result) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }
    }
}
