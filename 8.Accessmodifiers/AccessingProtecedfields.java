
 /* 3. Create a class with PROTECTED fields and methods. Access these fields and methods
 * from any other class in the same package.
 */
public class AccessingProtecedfields {
  protected String name = "Lion";
    protected int age = 5;

    // Protected method
    protected void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Animal Age: " + age);
    }   
}
