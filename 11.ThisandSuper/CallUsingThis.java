/*1. Print the fields/instance members of the current class using this and without using object
 * 3. Call constructor of the current class using this()
 * 4. Call argument constructor of current class using this() */
public class CallUsingThis {
    // Main class
    int a;
    String name;

    // Default constructor calling parameterized constructor using this()
    CallUsingThis() {
        this(100, "Imran"); // Calls the argument constructor
        System.out.println("Default Constructor Called");
    }

    // Parameterized constructor
    CallUsingThis(int a, String name) {
        this.a = a;
        this.name = name;
        System.out.println("Parameterized Constructor Called");
    }

    // Method to print fields using 'this'
    void display() {
        System.out.println("Value of a: " + this.a);
        System.out.println("Name: " + this.name);
    }

    public static void main(String[] args) {
        CallUsingThis obj = new CallUsingThis(); // Calls default constructor
        obj.display(); // Prints instance members using this
    }
}

