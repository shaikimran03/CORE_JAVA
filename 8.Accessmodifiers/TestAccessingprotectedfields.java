 /* 3. Create a class with PROTECTED fields and methods. Access these fields and methods
 * from any other class in the same package.
 */
public class TestAccessingprotectedfields {
     public static void main(String[] args) {
        AccessingProtecedfields animal = new AccessingProtecedfields();

        // Accessing protected fields
        System.out.println("Accessing protected fields from same package:");
        System.out.println("Name: " + animal.name);
        System.out.println("Age: " + animal.age);

        // Accessing protected method
        animal.displayInfo();
    }
}
