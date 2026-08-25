public class AssignmentOperators {

    public static void main(String[] args) {

        var a = 5;
        var b = 3;

        // Assignment

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        a %= 2;
        System.out.println(a);
    }
}