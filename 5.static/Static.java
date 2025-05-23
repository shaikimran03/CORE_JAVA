 /** 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance
 * methods and a main method.
 * 2. Print instance variables in static methods
 * 3. Print static variables in Instance methods
 * 4. Call instance methods in static methods
 * 5. Call static methods in instance methods
 * 6. Print all the static, instance variables in main method
 * 7. Call static methods and instance methods in main method
 */

public class Static {

    // 1. Static variables
    static int count = 5;
    static String courseName = "Java Programming";

    // 1. Instance variables
    int rollNumber = 10;
    String studentName = "Imran";

    // 2. Static method 1: Access instance variables using object
    static void displayInstanceData() {
        System.out.println("\n--- Inside static method: displayInstanceData ---");
        Static obj = new Static();  // object to access instance variables
        System.out.println("Student Name (instance): " + obj.studentName);
        System.out.println("Roll Number (instance): " + obj.rollNumber);

        // 4. Call instance method in static method
        obj.showStudentDetails();
    }

    // 2. Static method 2
    static void displayCourseInfo() {
        System.out.println("\n--- Inside static method: displayCourseInfo ---");
        System.out.println("Course Name (static): " + courseName);
        System.out.println("Total Count (static): " + count);
    }

    // 2. Instance method 1
    void showStudentDetails() {
        System.out.println("\n--- Inside instance method: showStudentDetails ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + rollNumber);

        // 5. Call static method in instance method
        displayCourseInfo();
    }

    // 2. Instance method 2
    void greetStudent() {
        System.out.println("\n--- Inside instance method: greetStudent ---");
        System.out.println("Hello, " + studentName + "! Welcome to " + courseName);
    }

    // 6 & 7. Main method
    public static void main(String[] args) {
        System.out.println("=== Program Start ===");

        // Object creation to access instance variables & methods
        Static student = new Static();

        // 6. Print all variables
        System.out.println("\n--- Printing All Variables ---");
        System.out.println("Static Variable 1 (count): " + count);
        System.out.println("Static Variable 2 (courseName): " + courseName);
        System.out.println("Instance Variable 1 (rollNumber): " + student.rollNumber);
        System.out.println("Instance Variable 2 (studentName): " + student.studentName);

        // 7. Call static and instance methods
        displayInstanceData();    // static method
        displayCourseInfo();      // static method
        student.showStudentDetails(); // instance method
        student.greetStudent();       // instance method

        System.out.println("\n=== Program End ===");
    }
}
