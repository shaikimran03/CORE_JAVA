/*2. Print the fields/instance members of the parent class using super
 * 5. Call constructor of the parent class using super() */
package CallUsingSuper;

public class Child extends Parent {
  int b = 20;

    // Constructor
    Child() {
        super(); // Calls the parent class constructor
        System.out.println("Child constructor called");
    }

    // Method to print instance members of the parent class
    void display() {
        System.out.println("Value of a (Parent class): " + super.a);
        System.out.println("Name from Parent class: " + super.name);
    }
}



