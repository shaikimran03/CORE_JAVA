// * 10.Write a program to generate ClassNotFoundException

public class ClassNotFound {
    
    public static void main(String[] args) {
        try {
            // Trying to load a non-existent class
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
}

    

