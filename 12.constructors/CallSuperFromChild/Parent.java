/*02. Call the constructors(both default and argument constructors) of super class from a child
 * class */
package CallSuperFromChild;

public class Parent {
     // Default constructor
    Parent() {
        System.out.println("Parent default constructor called.");
    }

    // Parameterized constructor
    Parent(String message) {
        System.out.println("Parent parameterized constructor called with message: " + message);
    }
}
