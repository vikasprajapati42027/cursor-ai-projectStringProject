public class StringManipulation {

    /**
     * Demonstrates advanced string manipulation techniques.
     */
    public static void main(String[] args) {
        // String declaration
        String originalString = "Java Programming";
        System.out.println("Original string: " + originalString);

        // String concatenation using concat method
        String concatenatedString = originalString.concat(" is fun");
        System.out.println("\nAfter concatenation using concat method:");
        System.out.println(concatenatedString);

        // Checking if string starts with a specific sequence
        System.out.println("\nChecking starts with:");
        System.out.println("Does the original string start with 'Java'? " + originalString.startsWith("Java"));

        // Checking if string ends with a specific sequence
        System.out.println("\nChecking ends with:");
        System.out.println("Does the original string end with 'ing'? " + originalString.endsWith("ing"));

        // String contains
        System.out.println("\nChecking contains:");
        System.out.println("Does the original string contain 'Pro'? " + originalString.contains("Pro"));

        // Index of a specific character or substring
        System.out.println("\nIndex of 'a':");
        System.out.println("The index of first 'a' in the original string: " + originalString.indexOf('a'));
        System.out.println("The index of 'Pro' in the original string: " + originalString.indexOf("Pro"));

        // Last index of a specific character or substring
        System.out.println("\nLast index of 'a':");
        System.out.println("The last index of 'a' in the original string: " + originalString.lastIndexOf('a'));

        // Substring with one parameter
        System.out.println("\nSubstring from index 5:");
        System.out.println("Substring from index 5: " + originalString.substring(5));

        // Substring with two parameters
        System.out.println("\nSubstring from index 5 to 8:");
        System.out.println("Substring from index 5 to 8: " + originalString.substring(5, 9));

        // String replace all
        System.out.println("\nString replace all 'a' with 'x':");
        System.out.println("After replacing all 'a' with 'x': " + originalString.replaceAll("a", "x"));

        // String split
        System.out.println("\nString split by space:");
        String[] words = originalString.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // String join
        System.out.println("\nString join with delimiter '-':");
        String joinedString = String.join("-", words);
        System.out.println("Joined string: " + joinedString);
    }
}
