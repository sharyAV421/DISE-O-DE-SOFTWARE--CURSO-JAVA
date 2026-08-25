public class OperatorsExercises {

    public static void main(String[] args) {

        // 1. Create a variable with the result of each arithmetic operation.
        int addition = 10 + 5;
        int subtraction = 10 - 5;
        int multiplication = 10 * 5;
        int division = 10 / 5;
        int remainder = 10 % 3;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(remainder);


        // 2. Create a variable for each type of assignment operation.
        int a = 10;

        a += 5;
        System.out.println(a);

        a -= 3;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 4;
        System.out.println(a);

        a %= 3;
        System.out.println(a);


        // 3. Print 3 true comparisons with different comparison operators.
        System.out.println(10 > 5);
        System.out.println(10 != 5);
        System.out.println(10 >= 10);


        // 4. Print 3 false comparisons with different comparison operators.
        System.out.println(10 < 5);
        System.out.println(10 == 5);
        System.out.println(10 <= 5);


        // 5. Use the logical AND operator.
        System.out.println(10 > 5 && 5 < 10);


        // 6. Use the logical OR operator.
        System.out.println(10 < 5 || 5 < 10);


        // 7. Combine both logical operators.
        System.out.println(10 > 5 && (5 < 10 || 2 == 3));


        // 8. Add a negation.
        System.out.println(!(10 < 5));


        // 9. Print 3 examples of unary operators.
        int b = 5;

        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b--);


        // 10. Combine arithmetic, comparison and logical operators.
        int x = 10;
        int y = 5;

        System.out.println((x + y > 10) && (x != y));
    }
}