/*02. Call the constructors(both default and argument constructors) of super class from a child
 * class */
package CallSuperFromChild;

public class Child extends Parent {
     Child() {
        super(); // calls Parent()
        System.out.println("Child constructor called (default).");
    }

    // Child constructor calling Parent's parameterized constructor
    Child(String msg) {
        super(msg); // calls Parent(String)
        System.out.println("Child constructor called with message: " + msg);
    }

}

