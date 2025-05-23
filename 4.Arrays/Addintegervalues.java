// 1. Write a function to add integer values of an array

public class Addintegervalues {


    // Function to add integer values of an array
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] numbers = {101, 2320, 3330, 4340, 52320};
        int total = sumArray(numbers);
        System.out.println("The sum of the array is: " + total);
    }
}

