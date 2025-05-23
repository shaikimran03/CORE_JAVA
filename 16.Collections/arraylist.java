    import java.util.ArrayList;
import java.util.Iterator;
public class arraylist {


    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> list = new ArrayList<>();

        //a. Add 10 elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");
        list.add("Fig");
        list.add("Grape");
        list.add("Honeydew");
        list.add("Indian Fig");
        list.add("Jackfruit");

        System.out.println("Original ArrayList: " + list);

        // Add an element to the ArrayList
        list.add("Kiwi");
        System.out.println("After adding 'Kiwi': " + list);

        //b. Iterate through the ArrayList using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " | ");
        }
        System.out.println();

        //c. Add an element at a specific index
        list.add(3, "Dragonfruit");  // at index 3
        System.out.println("After adding 'Dragonfruit' at index 3: " + list);

        // d.Remove an element by value
        list.remove("Fig");
        System.out.println("After removing 'Fig': " + list);

        // Remove an element at a specific index
        list.remove(5);
        System.out.println("After removing element at index 5: " + list);

        //e. Update the element at a specific index
        list.set(2, "Cantaloupe");
        System.out.println("After updating element at index 2 to 'Cantaloupe': " + list);

        //f. Check if element is present at a particular index
        int checkIndex = 4;
        if (checkIndex >= 0 && checkIndex < list.size()) {
            System.out.println("Element at index " + checkIndex + " is: " + list.get(checkIndex));
        } else {
            System.out.println("Index " + checkIndex + " is out of bounds.");
        }

        //g. Get an element at a particular index
        int getIndex = 7;
        if (getIndex >= 0 && getIndex < list.size()) {
            String element = list.get(getIndex);
            System.out.println("Element retrieved at index " + getIndex + ": " + element);
        } else {
            System.out.println("Index " + getIndex + " is out of bounds.");
        }

        //h. Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + list.size());

        //i. Check if a given element is present in the ArrayList
        String searchElement = "Banana";
        boolean contains = list.contains(searchElement);
        System.out.println("Is '" + searchElement + "' present? " + contains);

        // j.Remove all elements of the ArrayList
        list.clear();
        System.out.println("After removing all elements, size: " + list.size());
    }
}


