/*3. Also, Access the PROTECTED fields and methods from child class located
 * in a different package
 * <p>
 * - Access the PROTECTED fields and methods from any class in different package
 */
package package2;

import AccessProtectedfieldmethod.Parent;

public class Child extends Parent{
	   public void accessProtected() {
        System.out.println(protectedField);  // ✅ allowed
        protectedMethod();                   // ✅ allowed
    }
}
