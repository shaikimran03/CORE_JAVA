public class Arithmetic {

    public static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("Addition: " + calculate(num1, num2, '+'));
        System.out.println("Subtraction: " + calculate(num1, num2, '-'));
        System.out.println("Multiplication: " + calculate(num1, num2, '*'));
        System.out.println("Division: " + calculate(num1, num2, '/'));
    }
}
