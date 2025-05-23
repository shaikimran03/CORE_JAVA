// 3. Apply private, public, protected, and default access modifiers to constructors

public class PublicPrivateProtectedDefault {
     PublicPrivateProtectedDefault() {
        System.out.println("Default (package-private) constructor called.");
    }

    // Public constructor
    public PublicPrivateProtectedDefault(String name) {
        System.out.println("Public constructor called. Name: " + name);
    }

    // Protected constructor
    protected PublicPrivateProtectedDefault(int age) {
        System.out.println("Protected constructor called. Age: " + age);
    }

    // Private constructor
    private PublicPrivateProtectedDefault(double salary) {
        System.out.println("Private constructor called. Salary: " + salary);
    }

    // Public static method to call private constructor from within the class
    public static PublicPrivateProtectedDefault createWithSalary() {
        return new PublicPrivateProtectedDefault(50000.0);
    }

    public static void main(String[] args) {
        new PublicPrivateProtectedDefault();              // default constructor
        new PublicPrivateProtectedDefault("Alice");       // public constructor
        new PublicPrivateProtectedDefault(25);            // protected constructor
        PublicPrivateProtectedDefault.createWithSalary(); // calls private constructor internally
    }
}
