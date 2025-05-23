//5. Write a program to throw exception with your own message 

public class ThrowWithTry {

      public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("This is a exception message.");
    }
}
