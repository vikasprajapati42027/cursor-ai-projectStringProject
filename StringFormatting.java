public class StringFormatting {

    /**
     * Demonstrates various string formatting techniques in Java.
     */
    public static void main(String[] args) {
        // Formatting using printf
        System.out.println("Formatting with printf:");
        int year = 2022;
        double price = 999.99;
        System.out.printf("Year: %d, Price: %.2f\n", year, price);

        // Formatting using String.format
        System.out.println("\nFormatting with String.format:");
        String formattedString = String.format("Year: %d, Price: %.2f", year, price);
        System.out.println(formattedString);

        // Formatting dates
        System.out.println("\nFormatting dates:");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2022, java.util.Calendar.OCTOBER, 5); // Year, Month, Day
        java.util.Date date = cal.getTime();
        formattedString = String.format("Date: %1$td/%1$tm/%1$tY", date);
        System.out.println(formattedString);

        // Left padding a string
        System.out.println("\nLeft padding a string:");
        String name = "Java";
        formattedString = String.format("%10s", name); // 10 character space, right-aligned
        System.out.println("'" + formattedString + "'");

        // Right padding a string
        System.out.println("\nRight padding a string:");
        formattedString = String.format("%-10s", name); // 10 character space, left-aligned
        System.out.println("'" + formattedString + "'");

        // Using StringBuilder for complex formatting
        System.out.println("\nUsing StringBuilder for complex formatting:");
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Year: %d\n", year));
        sb.append(String.format("Price: %.2f\n", price));
        sb.append(String.format("Date: %1$td/%1$tm/%1$tY\n", date));
        sb.append(String.format("Name: %s\n", name));
        System.out.println(sb.toString());
    }
}
