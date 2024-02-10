public class Main {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Java String Operations Project!");

        // Basic String Operations
        System.out.println("\n--- Basic String Operations ---");
        BasicStringOperations basicOps = new BasicStringOperations();
        basicOps.showBasicOperations();

        // String Manipulation
        System.out.println("\n--- String Manipulation ---");
        StringManipulation stringManipulation = new StringManipulation();
        stringManipulation.showManipulations();

        // String Formatting
        System.out.println("\n--- String Formatting ---");
        StringFormatting stringFormatting = new StringFormatting();
        stringFormatting.showFormatting();

        // String Conversion
        System.out.println("\n--- String Conversion ---");
        StringConversion stringConversion = new StringConversion();
        stringConversion.showConversions();

        // End of the program
        System.out.println("\nThank you for exploring Java String Operations with us!");
    }
}
