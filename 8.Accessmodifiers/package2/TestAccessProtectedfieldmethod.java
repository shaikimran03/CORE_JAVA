/*3. Also, Access the PROTECTED fields and methods from child class located
 * in a different package
 * <p>
 * - Access the PROTECTED fields and methods from any class in different package
 */
package package2;
import AccessProtectedfieldmethod.Parent;

// Subclass of Parent in a different package
public class TestAccessProtectedfieldmethod extends Parent {

    public void accessProtected() {
        // Accessing protected member via inheritance
        //System.out.println(p.protectedField);  // ❌ Compilation error
        //p.protectedMethod();     
       // Non-subclass in different package	❌	Not allowed              // ❌ Compilation error
    }
}