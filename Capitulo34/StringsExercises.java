public class StringsExercises {

    public static void main(String[] args) {

        // 1. Concatenate two strings
        String firstName = "Brais";
        String lastName = "Moure";
        System.out.println(firstName + " " + lastName);

        // 2. Get the length of a string
        String text = "Hello Java";
        System.out.println(text.length());

        // 3. Get a character from a string
        System.out.println(text.charAt(0));

        // 4. Get a substring
        System.out.println(text.substring(0, 5));

        // 5. Convert a string to uppercase
        System.out.println(text.toUpperCase());

        // 6. Convert a string to lowercase
        System.out.println(text.toLowerCase());

        // 7. Check if a string contains another string
        System.out.println(text.contains("Java"));

        // 8. Compare two strings
        System.out.println(text.equals("Hello Java"));

        // 9. Remove spaces and replace characters
        String message = "  Hello Java  ";
        System.out.println(message.trim());
        System.out.println(text.replace("Java", "World"));

        // 10. Format a string
        System.out.println(String.format("Hello, %s %s", firstName, lastName));
    }
}