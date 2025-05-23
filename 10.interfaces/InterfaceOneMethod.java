/* * 01. Create an interface with only one method and implement it in a class. Call the method
 * implemented. */
// Step 1: Define an interface with a single method


interface MyInterface {
    void displayMessage(); // Abstract method
}

// Step 2: Implement the interface in a class
class MyClass implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("Hello, this is the implemented method!");
    }
}

// Step 3: Call the implemented method
public class InterfaceOneMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Create an instance
        obj.displayMessage(); // Call the method
    }
}