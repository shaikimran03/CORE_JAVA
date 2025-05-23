// * 17. Write a program to generate StringIndexOutOfBoundsException
public class StringIndexOutOfBonds {

    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 20; // This index is out of bounds for the string

        try {
            char ch = str.charAt(index); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character at index " + index + ": " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}
