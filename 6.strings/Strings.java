/**
 * 
1. Different ways creating a string 
 
2. Concatenating two strings using + operator 
 
3. Finding the length of the string 
 
4. Extract a string using Substring 
 
5. Searching in strings using indexOf() 
 
6. Matching a String Against a Regular Expression With matches() 
 
7. Comparing strings using the methods equals(),  
 
8. equalsIgnoreCase(), startsWith(), endsWith() and compareTo() 
 
9. Trimming strings with trim() 
 
10. Replacing characters in strings with replace() 
 
11. Splitting strings with split() 
 
12. Converting Numbers to Strings with valueOf() 
 
13. Converting integer objects to Strings 
 
14. Converting to uppercase and lowercase 
 */

public class Strings {


    public static void main(String[] args) {

        // 1. Different ways of creating strings
        String str1 = "Hello";                      // using string literal
        String str2 = new String("World");          // using new keyword

        // 2. Concatenating two strings using + operator
        String combined = str1 + " " + str2;
        System.out.println("2. Concatenated String: " + combined);

        // 3. Finding the length of the string
        System.out.println("3. Length of combined string: " + combined.length());

        // 4. Extract a substring
        String sub = combined.substring(6, 11); // "World"
        System.out.println("4. Substring: " + sub);

        // 5. Searching in strings using indexOf()
        int index = combined.indexOf("World");
        System.out.println("5. Index of 'World': " + index);

        // 6. Matching a string using matches()
        boolean isMatch = combined.matches("Hello World");
        System.out.println("6. Matches 'Hello World': " + isMatch);

        // 7. Comparing strings using equals()
        boolean isEqual = str1.equals("Hello");
        System.out.println("7. Equals 'Hello': " + isEqual);

        // 8. equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
        System.out.println("8. equalsIgnoreCase: " + str1.equalsIgnoreCase("hello"));
        System.out.println("   startsWith 'He': " + str1.startsWith("He"));
        System.out.println("   endsWith 'lo': " + str1.endsWith("lo"));
        System.out.println("   compareTo 'Hello': " + str1.compareTo("Hello")); // 0 means equal

        // 9. Trimming strings with trim()
        String messy = "   Trim Me!   ";
        System.out.println("9. Trimmed String: '" + messy.trim() + "'");

        // 10. Replacing characters in strings with replace()
        String replaced = combined.replace('o', '*');
        System.out.println("10. Replaced 'o' with '*': " + replaced);

        // 11. Splitting strings with split()
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("11. Split result:");
        for (String fruit : fruits) {
            System.out.println("   - " + fruit);
        }

        // 12. Converting numbers to strings with valueOf()
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println("12. Number to String using valueOf(): " + strNum);

        // 13. Converting Integer objects to strings
        Integer numberObj = 200;
        String strFromObj = numberObj.toString();
        System.out.println("13. Integer object to String: " + strFromObj);

        // 14. Converting to uppercase and lowercase
        System.out.println("14. Uppercase: " + str1.toUpperCase());
        System.out.println("    Lowercase: " + str2.toLowerCase());
    }
}


