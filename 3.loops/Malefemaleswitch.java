import java.util.Scanner;

public class Malefemaleswitch {
 
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        switch (gender) {
            case 'M':
                System.out.println("Gender is Male");
                break;
            case 'F':
                System.out.println("Gender is Female");
                break;
            default:
                System.out.println("Invalid input! Please enter M or F.");
        }

        scanner.close();
    }
}


