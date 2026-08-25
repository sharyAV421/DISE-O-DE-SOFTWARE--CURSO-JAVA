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
    }
}