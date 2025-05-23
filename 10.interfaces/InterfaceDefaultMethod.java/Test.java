/*6. Create an interface with a default method and implement it in a class. Do not provide
 * implementation to the default method and call the method.
 */ 
interface MyInterface {
    default void showMessage() {
        System.out.println("Default method from MyInterface");
    }
}

class Myclass implements MyInterface {
    // No need to override showMessage() unless custom behavior is needed
}

public class Test {

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.showMessage(); // Calls the default method from MyInterface
    }

}
