/*Create an abstract class with abstract and non-abstract methods.  */
abstract class Vehicle {
    // Abstract method (no body)
    abstract void startEngine();

    // Non-abstract method (has a body)
    void displayInfo() {
        System.out.println("This is a vehicle.");
    }
}

