//13. Write a program to generate NoSuchFieldException 
public class NoSuchField {

    public static void main(String[] args) {    
        try {
            Class<?> clazz = Class.forName("java.lang.String");
            clazz.getField("nonExistentField"); // This will throw NoSuchFieldException
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}