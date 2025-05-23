// * 16. Write a program to generate NumberFormatException
public class NumberFormat {

    public static void main(String[] args) {
        String str = "123abc"; // This string cannot be parsed as an integer

        try {
            int number = Integer.parseInt(str); // This will throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}
