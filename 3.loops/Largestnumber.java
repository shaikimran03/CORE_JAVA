import java.util.Scanner;
public class Largestnumber {

    // Helper method to return sign of difference: 1 if positive, 0 if zero, -1 if negative
    public static int sign(int diff) {
        if (diff > 0) return 1;
        else if (diff == 0) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Compare num1 and num2
        switch (sign(num1 - num2)) {
            case 1: // num1 > num2
                switch (sign(num1 - num3)) {
                    case 1:
                    case 0:
                        System.out.println("The largest number is: " + num1);
                        break;
                    case -1:
                        System.out.println("The largest number is: " + num3);
                        break;
                }
                break;
            case 0: // num1 == num2
                switch (sign(num1 - num3)) {
                    case 1:
                    case 0:
                        System.out.println("The largest number is: " + num1);
                        break;
                    case -1:
                        System.out.println("The largest number is: " + num3);
                        break;
                }
                break;
            case -1: // num1 < num2
                switch (sign(num2 - num3)) {
                    case 1:
                    case 0:
                        System.out.println("The largest number is: " + num2);
                        break;
                    case -1:
                        System.out.println("The largest number is: " + num3);
                        break;
                }
                break;
        }

        scanner.close();
    }
}


