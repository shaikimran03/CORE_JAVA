// 5. Try to Call the Constructor Multiple Times with the Same Object

//No, constructors in Java can only be called once per object, when the object is created using new.
public class CallConstructoragain {
    
    CallConstructoragain() {
        System.out.println("Constructor called");
    }

    void callConstructorAgain() {
        // This is invalid and will cause a compile error:
        // CallConstructoragain(); // Syntax error: constructor call only allowed during new object creation
    }


    public static void main(String[] args) {
        CallConstructoragain obj = new CallConstructoragain();  // Constructor called once

        obj.callConstructorAgain();  // Demonstrate usage of obj
          // obj.callConstructorAgain();  // Trying to call constructor again is impossible
    }
}

