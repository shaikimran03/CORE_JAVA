// * 15.Write a program to generate NullPointerException
public class NullPointer {

    public static void main(String[] args) {
        String str = null;

        // Attempting to call a method on a null object
        try {
            System.out.println(str.length());//this shows NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }
}