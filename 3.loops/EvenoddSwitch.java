import java.util.Scanner;
public class EvenoddSwitch {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            switch (i % 2) {
                case 0: // even
                    System.out.print(i + " ");
                    break;
                default:
                    // do nothing for odd numbers here
                    break;
            }
        }

        System.out.println("\n\nOdd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            switch (i % 2) {
                case 1: // odd
                    System.out.print(i + " ");
                    break;
                default:
                    // do nothing for even numbers here
                    break;
            }
        }

        scanner.close();
    }
}


