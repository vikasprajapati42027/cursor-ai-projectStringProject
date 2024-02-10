public class StringConversion {

    /**
     * Demonstrates various string conversion techniques in Java.
     */
    public static void main(String[] args) {
        // String to Primitive Data Types
        String numberString = "123";
        System.out.println("Original String: " + numberString);

        // String to int
        int numberInt = Integer.parseInt(numberString);
        System.out.println("Converted to int: " + numberInt);

        // String to double
        double numberDouble = Double.parseDouble(numberString);
        System.out.println("Converted to double: " + numberDouble);

        // String to boolean
        String booleanString = "true";
        boolean booleanValue = Boolean.parseBoolean(booleanString);
        System.out.println("Converted to boolean: " + booleanValue);

        // Primitive Data Types to String
        int num = 456;
        String intToString = Integer.toString(num);
        System.out.println("int to String: " + intToString);

        double decimal = 123.45;
        String doubleToString = Double.toString(decimal);
        System.out.println("double to String: " + doubleToString);

        boolean bool = false;
        String booleanToString = Boolean.toString(bool);
        System.out.println("boolean to String: " + booleanToString);

        // Using String.valueOf for conversion
        String valueOfInt = String.valueOf(num);
        System.out.println("Using String.valueOf for int: " + valueOfInt);

        String valueOfDouble = String.valueOf(decimal);
        System.out.println("Using String.valueOf for double: " + valueOfDouble);

        String valueOfBoolean = String.valueOf(bool);
        System.out.println("Using String.valueOf for boolean: " + valueOfBoolean);

        // Converting char array to String
        char[] charArray = {'J', 'a', 'v', 'a'};
        String charArrayToString = new String(charArray);
        System.out.println("char array to String: " + charArrayToString);

        // Converting String to char array
        String str = "Hello World";
        char[] stringToCharArray = str.toCharArray();
        System.out.print("String to char array: ");
        for (char c : stringToCharArray) {
            System.out.print(c);
        }
        System.out.println(); // New line for better readability
    }
}
