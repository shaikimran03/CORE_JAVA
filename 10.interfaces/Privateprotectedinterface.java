/* 09. Create a PRIVATE or PROTECTED interface and print the values as above scenario*/
public class Privateprotectedinterface {
    
    protected interface MyProtectedInterface {
        void show();
    }

    private interface MyPrivateInterface {
        void print();
    }

    static class InnerClass implements MyProtectedInterface, MyPrivateInterface {
        public void show() {
            System.out.println("This is a protected interface method.");
        }

        public void print() {
            System.out.println("This is a private interface method.");
        }
    }
    
    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.show();
        obj.print();
    }
}


