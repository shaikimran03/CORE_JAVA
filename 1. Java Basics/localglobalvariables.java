public class localglobalvariables {

    // Global (instance) variable
    int number = 10;

    public void showVariables() {
        // Local variable with the same name
        int number = 50;

        // Print local variable
        System.out.println("Local variable: " + number);

        // Print global variable using 'this' keyword
        System.out.println("Global (instance) variable: " + this.number);
    }

    public static void main(String[] args) {
        // Create object
        localglobalvariables obj = new localglobalvariables();

        // Call method to display variables
        obj.showVariables();
    }
}

