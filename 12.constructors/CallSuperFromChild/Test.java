/*02. Call the constructors(both default and argument constructors) of super class from a child
 * class */
package CallSuperFromChild;

public class Test {
      public static void main(String[] args) {
        System.out.println("---- Calling default constructor ----");
        Child obj1 = new Child();
        System.out.println(obj1);

        System.out.println("---- Calling parameterized constructor ----");
        Child obj2 = new Child("Hello from child");
        System.out.println(obj2);
    }
}
