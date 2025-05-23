// * 6. Write a program to create your own exception

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Program
public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age = 16; // try changing this to test different outcomes

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }

    // Method that throws the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

