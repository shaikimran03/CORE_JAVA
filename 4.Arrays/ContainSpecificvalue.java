//4. Write a function to test if array contains a specific value
public class ContainSpecificvalue {
    

    // Function to check if a specific value exists in the array
    public static boolean containsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] numbers = {3, 8, 15, 22, 30};

        int valueToCheck = 15;

        if (containsValue(numbers, valueToCheck)) {
            System.out.println("Array contains the value: " + valueToCheck);
        } else {
            System.out.println("Array does NOT contain the value: " + valueToCheck);
        }
    }
}

