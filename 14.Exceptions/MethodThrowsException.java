// * 3.Write a method which throws exception, Call that method in main class without try block

public class MethodThrowsException {

     // Method that throws an exception
    public static void riskyMethod() throws Exception {
        throw new Exception("This is a custom exception from riskyMethod()");
    }

    // Main method declaring the exception instead of handling it
    public static void main(String[] args) throws Exception {
        // Calling the method without try-catch
        riskyMethod();

        System.out.println("This line will not be executed if an exception is thrown.");
    }
}
