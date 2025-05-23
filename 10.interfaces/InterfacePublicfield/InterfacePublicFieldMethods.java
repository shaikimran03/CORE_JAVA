package InterfacePublicfield;
/*8. Create a PUBLIC interface with fields and methods, fields should have values assigned.
 * Implement this interface to some class and print the values of the interface fields and
 * call the interface methods */
public interface InterfacePublicFieldMethods {
    // Define a public interface with fields and methods
    // Fields (implicitly public static final)
    int ID = 101;
    String NAME = "Imran";

    // Abstract method (implicitly public)
    void displayInfo();
}

// Implementing the interface in a class
class MyClass implements InterfacePublicFieldMethods {
    // Implementing the interface method
    public void displayInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + NAME);
    }

    // Implementing the missing method
    public void displayMessage() {
        System.out.println("This is displayMessage() from InterfacePublicFieldMethods.");
    }
}

// Main class to test the implementation
// (Moved to Main.java)
    
