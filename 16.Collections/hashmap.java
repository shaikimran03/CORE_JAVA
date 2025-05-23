import java.util.HashMap;

public class hashmap {

    public static void main(String[] args) {
        // Create a HashMap with 10 key-value pairs (StudentID -> Name)
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Helen");
        studentMap.put(109, "Ivy");
        studentMap.put(110, "Jack");

        System.out.println("Original Map: " + studentMap);

        // a. Insert a Key-Value mapping into the map
        studentMap.put(111, "Karen");
        System.out.println("After adding (111, Karen): " + studentMap);

        // b. Fetch the value of a Key
        int keyToFetch = 104;
        String value = studentMap.get(keyToFetch);
        System.out.println("Value for key " + keyToFetch + ": " + value);

        // c. Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = new HashMap<>(studentMap);
        System.out.println("Cloned Map: " + clonedMap);

        // d. Check if the given Key is in the Map
        int keyToCheck = 107;
        System.out.println("Is key " + keyToCheck + " present? " + studentMap.containsKey(keyToCheck));

        // e. Check if the value is in the Map
        String valueToCheck = "Eva";
        System.out.println("Is value '" + valueToCheck + "' present? " + studentMap.containsValue(valueToCheck));

        // f. Check if the map is empty
        System.out.println("Is the map empty? " + studentMap.isEmpty());

        // g. Print the size of the Map
        System.out.println("Size of the map: " + studentMap.size());

        // h. Print all the Keys of the map
        System.out.println("All keys in the map: " + studentMap.keySet());

        // i. Print all the Values of the map
        System.out.println("All values in the map: " + studentMap.values());

        // j. Remove a specific Key-Value pair
        int keyToRemove = 105;
        studentMap.remove(keyToRemove);
        System.out.println("After removing key " + keyToRemove + ": " + studentMap);

        // k. Copy all the elements of the Map to another Map
        HashMap<Integer, String> copyMap = new HashMap<>();
        copyMap.putAll(studentMap);
        System.out.println("Copied Map: " + copyMap);
    }
}
