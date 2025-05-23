/*2. Create a sub class for an abstract class. Create an object in the child class for the  
abstract class and access the non-abstract methods 
  */
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    // Method to create an object for the abstract class and access non-abstract method
    void accessNonAbstractMethodFromAbstract() {
        Vehicle vehicle = new Car(); // Using child class object for abstract class reference
        vehicle.displayInfo();       // Accessing non-abstract method
    }
}
