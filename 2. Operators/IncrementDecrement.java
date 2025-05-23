public class IncrementDecrement {

    // Method to demonstrate increment and decrement
    public static void showIncrementDecrement(int number) {
        System.out.println("Original number: " + number);

        // Pre-increment
        int preIncrement = ++number;
        System.out.println("After pre-increment (++number): " + preIncrement);

        // Post-increment
        int postIncrement = number++;
        System.out.println("After post-increment (number++): " + postIncrement);
        System.out.println("Value after post-increment: " + number);

        // Pre-decrement
        int preDecrement = --number;
        System.out.println("After pre-decrement (--number): " + preDecrement);

        // Post-decrement
        int postDecrement = number--;
        System.out.println("After post-decrement (number--): " + postDecrement);
        System.out.println("Value after post-decrement: " + number);
    }

    public static void main(String[] args) {
        int num = 10;
        showIncrementDecrement(num);
    }
}
