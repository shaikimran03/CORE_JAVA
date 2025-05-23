// * 6. Write a function to copy an array to another array

public class Copyarray {


    // Function to copy contents of one array to another
    public static int[] copyArray(int[] source) {
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        return destination;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};

        int[] copiedArray = copyArray(originalArray);

        System.out.print("Copied array: ");
        for (int num : copiedArray) {
            System.out.print(num + " ");
        }
    }
}
    

