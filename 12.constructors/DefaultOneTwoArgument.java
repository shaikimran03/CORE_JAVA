/* 1. Write a class with a default constructor, one argument constructor and two argument
 * constructors. Instantiate the class to call all the constructors of that class from
 * a main class*/
public class DefaultOneTwoArgument {
    
    // Default constructor
    DefaultOneTwoArgument() {
        System.out.println("Default constructor called.");
    }

    // One-argument constructor
    DefaultOneTwoArgument(String name) {
        System.out.println("One-argument constructor called. Name: " + name);
    }

    // Two-argument constructor
    DefaultOneTwoArgument(String name, int age) {
        System.out.println("Two-argument constructor called. Name: " + name + ", Age: " + age);
    }
       public static void main(String[] args) {
        // Call default constructor
        DefaultOneTwoArgument DefaultOneTwoArgument1 = new DefaultOneTwoArgument();
        System.out.println("DefaultOneTwoArgument1 object created: " + DefaultOneTwoArgument1);

        // Call one-argument constructor
        DefaultOneTwoArgument DefaultOneTwoArgument2 = new DefaultOneTwoArgument("Imran");
        System.out.println("DefaultOneTwoArgument2 object created: " + DefaultOneTwoArgument2);

        // Call two-argument constructor
        DefaultOneTwoArgument DefaultOneTwoArgument3 = new DefaultOneTwoArgument("shaik", 21);
        System.out.println("DefaultOneTwoArgument3 object created: " + DefaultOneTwoArgument3);
    }



}