/*3. Also, Access the PROTECTED fields and methods from child class located
 * in a different package
 * <p>
 * - Access the PROTECTED fields and methods from any class in different package
 */
package AccessProtectedfieldmethod;

public class Parent {
    
    protected String protectedField = "Protected Field";

    protected void protectedMethod() {
        System.out.println("Protected Method in Parent");
    }
    
}
