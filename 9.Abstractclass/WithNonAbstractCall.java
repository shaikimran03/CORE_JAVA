/*4. Create an instance for the child class in child class and call non-abstract methods */
class WithNonAbstractCall extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started from abstract method.");
    }

    void callNonAbstractMethod() {
        WithNonAbstractCall obj = new WithNonAbstractCall();
        obj.displayInfo(); // Calling non-abstract method from abstract class
    }
}
