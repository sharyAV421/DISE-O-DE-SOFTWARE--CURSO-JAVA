public class Strings {

    public static void main(String[] args) {

        String name = "Brais";
        var surname = new String("Moure");

        // Concatenation
        System.out.println(name + " " + surname);

        // Length
        System.out.println(name.length());
        System.out.println(surname.length());

        // charAt
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));

        // substring
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));

        // Uppercase and lowercase
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Contains
        System.out.println(name.contains("B"));
        System.out.println(name.contains("z"));
    }
}