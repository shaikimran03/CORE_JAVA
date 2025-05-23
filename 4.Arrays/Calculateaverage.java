public class Calculateaverage {
    

    // Function to calculate average of an integer array
    public static double averageArray(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        return (double) sum / array.length;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] numbers = {120, 220, 3430, 42330, 22350};
        double average = averageArray(numbers);
        System.out.println("The average of the array is: " + average);
    }
}


