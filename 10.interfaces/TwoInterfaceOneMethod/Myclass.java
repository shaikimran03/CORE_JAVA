package TwoInterfaceOneMethod;

public class Myclass  implements InterfaceOne, Interfacetwo {   
     public void methodOne() {
        System.out.println("Method One from InterfaceOne is implemented.");
    }

    public void methodTwo() {
        System.out.println("Method Two from InterfaceTwo is implemented.");
    }

}
