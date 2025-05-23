
////4. Create a class with PUBLIC fields and methods. Access the public methods and fields from any class in the same package or different package

public class Testpublicclassaccess {
    
    public static void main(String[] args) {
        publicclassfileds obj = new publicclassfileds();

        // Accessing public field
        System.out.println("Accessing public field: " + obj.message);

        // Accessing public method
        obj.showMessage();
    }
}
