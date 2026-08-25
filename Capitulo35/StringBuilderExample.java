public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("Hello");

        builder.append(" Java");

        System.out.println(builder);

        builder.insert(6, "World ");

        System.out.println(builder);

        builder.delete(6, 12);

        System.out.println(builder);

        builder.reverse();

        System.out.println(builder);
    }
}

