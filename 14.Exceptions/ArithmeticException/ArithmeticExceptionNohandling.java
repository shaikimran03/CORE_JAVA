//1. Write a program to generate Arithmetic Exception without exception handling
package ArithmeticException;

public class ArithmeticExceptionNohandling {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        System.out.println("\nPart 1: Without exception handling");
        // This will throw an ArithmeticException
        int result1 = a / b; // Division by zero
        System.out.println("Result1: " + result1); // This line will not be executed
    }
}
