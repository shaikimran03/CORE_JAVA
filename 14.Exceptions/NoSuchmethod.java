// * 14.Write a program to generate NoSuchMethodException
public class NoSuchmethod {

    public static void main(String[] args) {
        try {
            // Attempting to get a non-existent method using reflection
            NoSuchmethod obj = new NoSuchmethod();
            obj.getClass().getMethod("nonExistentMethodWithDifferentName");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }

    // This method does exist
    public void nonExistentMethod() {
        // This is just a placeholder
    }
}