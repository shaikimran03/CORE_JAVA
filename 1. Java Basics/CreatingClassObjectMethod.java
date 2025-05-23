//creating class
public class CreatingClassObjectMethod {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Main method - program execution starts here
    public static void main(String[] args) {
        // Creating object of CreatingClassObjectMethod
        CreatingClassObjectMethod calculator = new CreatingClassObjectMethod();

        //Method Signatures	: add(int, int) and subtract(int, int)
        
        // Calling add method
        int sum = calculator.add(15, 10);
        System.out.println("Sum: " + sum);  // Output: Sum: 25


        // Calling subtract method
        int difference = calculator.subtract(20, 5);
        System.out.println("Difference: " + difference);  // Output: Difference: 15
    }
}
