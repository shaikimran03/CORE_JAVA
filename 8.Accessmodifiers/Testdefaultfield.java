public class Testdefaultfield {
    public static void main(String[] args) {
        DefaultClassFields obj = new DefaultClassFields();

        // Accessing default field and method in the same package
        System.out.println("Accessing default field: " + obj.message);
        obj.showMessage();
    }
}
