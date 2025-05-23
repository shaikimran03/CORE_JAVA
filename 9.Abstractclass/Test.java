public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.accessNonAbstractMethodFromAbstract();

        WithAbstractCall abstractCall = new WithAbstractCall();
        abstractCall.callAbstractMethod();

        WithNonAbstractCall nonAbstractCall = new WithNonAbstractCall();
        nonAbstractCall.callNonAbstractMethod();
    }
}
