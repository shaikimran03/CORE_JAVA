/*7. Create an interface and inherit it from the other interface. 
 */
package InheritInterface;

public class Test implements child {
    public void makeSound() {
        System.out.println("Bark!");
    }

    public void wagtail() {
        System.out.println("Dog is wagging its tail!");
    }
     public static void main(String[] args) {
        Test myDog = new Test();
        myDog.makeSound();
        myDog.wagtail();
    }
}


