public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declare a String variable and assign your name.
        String name = "Shary";
        System.out.println(name);

        // 2. Create an int variable and assign your age.
        int age = 22;
        System.out.println(age);

        // 3. Create a double variable with your height in meters.
        double height = 1.50;
        System.out.println(height);

        // 4. Declare a boolean indicating whether you like programming.
        boolean likesProgramming = true;
        System.out.println(likesProgramming);

        // 5. Declare a constant with your email.
        final String EMAIL = "velasquezsara421@gmail.com";
        System.out.println(EMAIL);

        // 6. Create a char variable and store your initial.
        char initial = 'S';
        System.out.println(initial);

        // 7. Declare a String variable with your location,
        // then change its value and print it again.
        String location = "Pasto";
        location = "Narino";
        System.out.println(location);

        // 8. Create an int variable a, another b,
        // and print their sum.
        int a = 10;
        int b = 20;
        System.out.println(a + b);

        // 9. Print the type of two variables created previously.
        System.out.println(name.getClass().getSimpleName());
        System.out.println(EMAIL.getClass().getSimpleName());

        // 10. Declare a variable without initializing it,
        // then assign a value before printing it.
        int number;
        number = 100;
        System.out.println(number);
    }
}