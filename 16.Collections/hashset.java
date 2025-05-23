import java.util.HashSet;
import java.util.Iterator;
public class hashset{
    

    public static void main(String[] args) {
        // Create a HashSet of String with 10 elements
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        set.add("Yellow");
        set.add("Orange");
        set.add("Purple");
        set.add("Pink");
        set.add("Black");
        set.add("White");
        set.add("Brown");

        System.out.println("Original HashSet: " + set);

        // Add an element (will not add if already present)
        boolean added = set.add("Cyan");
        System.out.println("Added 'Cyan'? " + added);
        System.out.println("After adding 'Cyan': " + set);

        // Try adding duplicate element
        boolean addedDuplicate = set.add("Red");
        System.out.println("Added duplicate 'Red'? " + addedDuplicate);

        // Remove an element
        boolean removed = set.remove("Pink");
        System.out.println("Removed 'Pink'? " + removed);
        System.out.println("After removing 'Pink': " + set);

        // Check if an element is present
        boolean contains = set.contains("Blue");
        System.out.println("Contains 'Blue'? " + contains);

        // Check if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);

        // Size of the set
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Iterate using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " | ");
        }
        System.out.println();

        // Clear all elements
        set.clear();
        System.out.println("After clearing, is HashSet empty? " + set.isEmpty());
    }
}


