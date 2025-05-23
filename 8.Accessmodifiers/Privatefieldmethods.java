/** 1. Create a class with PRIVATE fields, private method and a main method. Print the fields
 * in main method. Call the private method in main method.
 * - Create a subclass and try to access the private fields and methods from subclass
 */
public class Privatefieldmethods {
    

    // Private fields
    private String name = "Imran";
    private int age = 21;

    // Private method
    private void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to access private fields and method
    public static void main(String[] args) {
        Privatefieldmethods p = new Privatefieldmethods();

        // Accessing private fields from within the same class
        System.out.println("Accessing private fields in main method:");
        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);

        // Calling private method
        p.showDetails();
    }
}


