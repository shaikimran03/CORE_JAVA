/** 11.  Create an interface with static final variable */
public interface staticfinalvar {

    
 // Explicitly declaring as public static final (even though it's implicit)
    public static final int VALUE = 42;
}

class Demo implements staticfinalvar {
   public void showValue() {
        System.out.println("The constant value is: " + VALUE);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.showValue();  // Output: The constant value is: 42
    }
}
