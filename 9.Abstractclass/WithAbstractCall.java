/* 3. Create an instance for the child class in child class and call abstract methods*/
class WithAbstractCall extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Calling abstract method: Car engine started.");
    }

    void callAbstractMethod() {
        WithAbstractCall obj = new WithAbstractCall();
        obj.startEngine(); // Calling abstract method implemented in this class
    }
}
