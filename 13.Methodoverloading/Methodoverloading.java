/* *
 * 01. Write two methods with the same name but different number of parameters of same type
 * and call the methods from main method
 *
 * 02. Write two methods with the same name but different number of parameters of different
 * data type and call the methods from main method
 *
 * 03. Write two methods with the same name and same number of parameters of same type
 * and call from main method
 *
 * 04. Write two methods with the same name and same number of parameters of different
 * type and call from main method
 *
 * 05. Write two methods with the same name, number of parameters and data type but
 * different return Type
 */


public class Methodoverloading {

    // 1. Same name, different number of parameters of same type
    public void printMessage(String msg) {
        System.out.println("Single message: " + msg);
    }

    public void printMessage(String msg1, String msg2) {
        System.out.println("Two messages: " + msg1 + " & " + msg2);
    }

    // 2. Same name, different number of parameters of different type
    public void printDetails(String name) {
        System.out.println("Name: " + name);
    }

    public void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // 3. Same name, same number of parameters (but different types to make it valid)
    public void calculate(int a, int b) {
        System.out.println("Sum of ints: " + (a + b));
    }

    public void calculate(double a, double b) {
        System.out.println("Sum of doubles: " + (a + b));
    }

    // 4. Same name, same number of parameters of different types
    public void showInfo(String label, int value) {
        System.out.println("String and int: " + label + ", " + value);
    }

    public void showInfo(int value, String label) {
        System.out.println("Int and String: " + value + ", " + label);
    }

    // 5. Same name, same parameters, same types, different return types – NOT ALLOWED
    // These methods would cause a compile error if uncommented
    /*
    public int convert(int x) {
        return x * 2;
    }

    public double convert(int x) {
        return x * 2.5;
    }
    */

    public static void main(String[] args) {
        Methodoverloading obj = new Methodoverloading();

        // 1. Different number of parameters (same type)
        obj.printMessage("Hello");
        obj.printMessage("Hello", "World");

        // 2. Different number of parameters (different type)
        obj.printDetails("Imran");
        obj.printDetails("shaik", 25);

        // 3. Same number of parameters (different types)
        obj.calculate(1, 30);
        obj.calculate(6.5, 8.5);

        // 4. Same number of parameters (different types/order)
        obj.showInfo("Level", 3);
        obj.showInfo(101, "developer");

        // 5. Overloading by return type only is not allowed
        System.out.println("\nNote: Overloading methods only by return type is NOT allowed in Java.");
    }
}
