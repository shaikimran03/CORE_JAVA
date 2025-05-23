 //* 2. Handle the Arithmetic exception using try-catch block
package ArithmeticException;
public class ArithmeticExceptionTryCatch {
    
    public static void main(String[] args) {

    
        int a = 1;
        int b = 0;


        System.out.println("\nPart 2: With exception handling using try-catch");
        try {
            int result2 = a / b;
            System.out.println("Result2: " + result2);
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
    }

