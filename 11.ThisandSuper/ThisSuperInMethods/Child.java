/* 6. Use this() and super() in methods not in constructor */

package ThisSuperInMethods;

public class Child extends Parent{
    int number = 20;

    void show() {
        // Accessing child class variable using this
        System.out.println("Child number: " + this.number);

        // Accessing parent class variable using super
        System.out.println("Parent number: " + super.number);

        // Calling parent class method using super
        super.display();

        // Calling current class method using this
        this.display();
    }

    void display() {
        System.out.println("Child class display method");
    }
}
