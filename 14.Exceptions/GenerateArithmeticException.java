// * 8. Write a program to generate Arithmetic Exception

public class GenerateArithmeticException {
    public static void main(String[] args) {
        int a = 111;
        int b = 0;

        // This line will cause ArithmeticException: / by zero
        int result = a / b;

        System.out.println("Result: " + result);
    }
}


