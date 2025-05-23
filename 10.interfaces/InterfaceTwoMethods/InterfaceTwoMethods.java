/* 02. Create an interface with two methods, but implement only one in a class. Call the
 * method implemented. */
package InterfaceTwoMethods;

// Interface with two methods
interface MyInterface {
    void methodOne();
    void methodTwo();
}

// Class implementing the interface
class MyClass implements MyInterface {
    public void methodOne() {
        System.out.println("Method One implemented");
    }
    public void methodTwo() {
        System.out.println("Method Two implemented");
    }
}

// Main class to create an instance and call the implemented method

