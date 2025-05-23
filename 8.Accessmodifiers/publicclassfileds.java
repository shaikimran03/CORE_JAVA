//4. Create a class with PUBLIC fields and methods. Access the public methods and fields from any class in the same package or different package
public class publicclassfileds {

    
// Simulating a public class from one package
    // Public field
    public String message = "This is a public field";

    // Public method
    public void showMessage() {
        System.out.println("Public method accessed: " + message);
    }
}

// Simulating access from another class (could be in same or different package)
