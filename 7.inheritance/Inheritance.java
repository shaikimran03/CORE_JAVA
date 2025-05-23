// Class A - Superclass
class A {
    // Instance variable (data member)
    String data = "Data from A";

    // Two specific methods in Class A
    void feature1() {
        System.out.println("A: feature1");
    }

    void feature2() {
        System.out.println("A: feature2");
    }

    // Overridden method in Class A
    void common() {
        System.out.println("A: common method");
    }
}

// Class B - Subclass of A
class B extends A {
    // Instance variable hides A's 'data' variable
    String data = "Data from B";

    // Two specific methods in Class B
    void feature3() {
        System.out.println("B: feature3");
    }

    void feature4() {
        System.out.println("B: feature4");
    }

    // Overriding the common() method from Class A
    @Override
    void common() {
        System.out.println("B: common method");
    }
}

// Class C - Subclass of B
class C extends B {
    // Instance variable hides B's 'data' variable
    String data = "Data from C";

    // Two specific methods in Class C
    void feature5() {
        System.out.println("C: feature5");
    }

    void feature6() {
        System.out.println("C: feature6");
    }

    // Overriding the common() method from Class B
    @Override
    void common() {
        System.out.println("C: common method");
    }
}

// Main class to test polymorphism and data members
public class Inheritance {
    public static void main(String[] args) {
        // Creating objects of each class
        A aObj = new A();
        B bObj = new B();
        C cObj = new C();

        // Calling methods and printing data for Class A object
        System.out.println("Using A object:");
        aObj.feature1();          // Calls A's feature1()
        aObj.feature2();          // Calls A's feature2()
        aObj.common();            // Calls A's common() - no overriding here
        System.out.println("Data: " + aObj.data);  // Access A's data variable
        System.out.println();

        // Calling methods and printing data for Class B object
        System.out.println("Using B object:");
        bObj.feature3();          // Calls B's feature3()
        bObj.feature4();          // Calls B's feature4()
        bObj.common();            // Calls B's overridden common()
        System.out.println("Data: " + bObj.data);  // Access B's data variable (hides A's)
        System.out.println();

        // Calling methods and printing data for Class C object
        System.out.println("Using C object:");
        cObj.feature5();          // Calls C's feature5()
        cObj.feature6();          // Calls C's feature6()
        cObj.common();            // Calls C's overridden common()
        System.out.println("Data: " + cObj.data);  // Access C's data variable (hides B's)
        System.out.println();

        // Using superclass (A) reference to refer to subclass objects
        A ref;

        System.out.println("Superclass reference to B object:");
        ref = bObj;               // Upcasting: superclass reference to subclass object
        ref.common();             // Runtime polymorphism: calls B's common() method
        // BUT...
        System.out.println("Data via superclass ref: " + ref.data);
        // Accesses A's data variable, NOT B's (fields are not polymorphic)
        System.out.println();

        System.out.println("Superclass reference to C object:");
        ref = cObj;               // Upcasting to C object
        ref.common();             // Runtime polymorphism: calls C's common() method
        // BUT...
        System.out.println("Data via superclass ref: " + ref.data);
        // Accesses A's data variable, NOT C's (fields are resolved by reference type)
        System.out.println();
    }
}
