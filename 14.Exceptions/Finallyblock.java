// * 7.Write a program with finally block

public class Finallyblock {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }

        System.out.println("Program continues after try-catch-finally.");
    }
}


