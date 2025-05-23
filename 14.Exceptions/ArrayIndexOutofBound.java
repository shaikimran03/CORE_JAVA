// * 9. Write a program to generate ArrayIndexOutOfBoundException

public class ArrayIndexOutofBound {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Accessing elements in the array:");

        for (int i = 0; i <= numbers.length; i++) { // Note: i <= length causes exception
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
// This code will throw an ArrayIndexOutOfBoundsException because the loop condition is incorrect.
