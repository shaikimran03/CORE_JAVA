import java.util.Scanner;

public class Relational {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks of two students
        System.out.print("Enter marks of Student A: ");
        int marksA = scanner.nextInt();

        System.out.print("Enter marks of Student B: ");
        int marksB = scanner.nextInt();

        // Relational comparisons
        System.out.println("\nComparing Student A and B marks:");
        System.out.println("Student A < Student B: " + (marksA < marksB));
        System.out.println("Student A <= Student B: " + (marksA <= marksB));
        System.out.println("Student A > Student B: " + (marksA > marksB));
        System.out.println("Student A >= Student B: " + (marksA >= marksB));

        scanner.close();
    }
}
