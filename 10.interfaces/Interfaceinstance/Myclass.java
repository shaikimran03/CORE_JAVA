package Interfaceinstance;

public class Myclass implements Myinterface {
    // Implementing the display() method from Myinterface
    public void display() {
        System.out.println("Display method implemented.");
    }

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display(); // Calls the implemented method
    }
    
}
