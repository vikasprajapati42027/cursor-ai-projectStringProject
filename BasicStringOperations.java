public class BasicStringOperations {

    /**
     * Demonstrates basic string operations.
     */
    public static void main(String[] args) {
        // String declaration and initialization
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("Original strings:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // String concatenation
        String str3 = str1 + " " + str2;
        System.out.println("\nAfter concatenation:");
        System.out.println("str3: " + str3);

        // String length
        System.out.println("\nString lengths:");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());
        System.out.println("Length of str3: " + str3.length());

        // Character at a specific index
        System.out.println("\nCharacter at specific index:");
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
        System.out.println("Character at index 2 in str2: " + str2.charAt(2));

        // Substring
        System.out.println("\nSubstring examples:");
        System.out.println("Substring of str3 from index 1 to 4: " + str3.substring(1, 5));

        // String comparison
        System.out.println("\nString comparison:");
        System.out.println("Comparing str1 and str2: " + str1.equals(str2));
        System.out.println("Comparing str1 and 'Hello': " + str1.equals("Hello"));

        // String to UpperCase and LowerCase
        System.out.println("\nString to UpperCase and LowerCase:");
        System.out.println("str1 to UpperCase: " + str1.toUpperCase());
        System.out.println("str2 to LowerCase: " + str2.toLowerCase());

        // String trim
        String str4 = "   Extra spaces   ";
        System.out.println("\nBefore and after trim:");
        System.out.println("str4 before trim: '" + str4 + "'");
        System.out.println("str4 after trim: '" + str4.trim() + "'");

        // String replace
        System.out.println("\nString replace:");
        System.out.println("Replacing 'l' with 'p' in str1: " + str1.replace('l', 'p'));
    }
}
