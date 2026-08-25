public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Check if the user can vote
        int age = 20;

        if (age >= 18) {
            System.out.println("1. You can vote.");
        } else {
            System.out.println("1. You cannot vote.");
        }


        // 2. Compare two numbers
        int number1 = 25;
        int number2 = 15;

        if (number1 > number2) {
            System.out.println("2. Number 1 is greater.");
        } else if (number2 > number1) {
            System.out.println("2. Number 2 is greater.");
        } else {
            System.out.println("2. Both numbers are equal.");
        }


        // 3. Check if a number is positive, negative or zero
        int number = -5;

        if (number > 0) {
            System.out.println("3. The number is positive.");
        } else if (number < 0) {
            System.out.println("3. The number is negative.");
        } else {
            System.out.println("3. The number is zero.");
        }


        // 4. Check if a number is even or odd
        int evenOddNumber = 8;

        if (evenOddNumber % 2 == 0) {
            System.out.println("4. The number is even.");
        } else {
            System.out.println("4. The number is odd.");
        }


        // 5. Check if a number is between 1 and 100
        int rangeNumber = 75;

        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println("5. The number is between 1 and 100.");
        } else {
            System.out.println("5. The number is outside the range.");
        }


        // 6. Show the day of the week using switch
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("6. Monday");
                break;
            case 2:
                System.out.println("6. Tuesday");
                break;
            case 3:
                System.out.println("6. Wednesday");
                break;
            case 4:
                System.out.println("6. Thursday");
                break;
            case 5:
                System.out.println("6. Friday");
                break;
            case 6:
                System.out.println("6. Saturday");
                break;
            case 7:
                System.out.println("6. Sunday");
                break;
            default:
                System.out.println("6. Invalid day.");
        }


        // 7. Simulate a grading system
        int grade = 85;

        if (grade >= 90) {
            System.out.println("7. Outstanding");
        } else if (grade >= 60) {
            System.out.println("7. Passed");
        } else {
            System.out.println("7. Failed");
        }


        // 8. Check if the user can enter the cinema
        int cinemaAge = 14;
        boolean accompanied = true;

        if (cinemaAge >= 15 || accompanied) {
            System.out.println("8. You can enter the cinema.");
        } else {
            System.out.println("8. You cannot enter the cinema.");
        }


        // 9. Check if a letter is a vowel or consonant
        char letter = 'e';

        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {
            System.out.println("9. The letter is a vowel.");
        } else {
            System.out.println("9. The letter is a consonant.");
        }
    }
public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Check if the user can vote
        int age = 20;

        if (age >= 18) {
            System.out.println("1. You can vote.");
        } else {
            System.out.println("1. You cannot vote.");
        }


        // 2. Compare two numbers
        int number1 = 25;
        int number2 = 15;

        if (number1 > number2) {
            System.out.println("2. Number 1 is greater.");
        } else if (number2 > number1) {
            System.out.println("2. Number 2 is greater.");
        } else {
            System.out.println("2. Both numbers are equal.");
        }


        // 3. Check if a number is positive, negative or zero
        int number = -5;

        if (number > 0) {
            System.out.println("3. The number is positive.");
        } else if (number < 0) {
            System.out.println("3. The number is negative.");
        } else {
            System.out.println("3. The number is zero.");
        }


        // 4. Check if a number is even or odd
        int evenOddNumber = 8;

        if (evenOddNumber % 2 == 0) {
            System.out.println("4. The number is even.");
        } else {
            System.out.println("4. The number is odd.");
        }


        // 5. Check if a number is between 1 and 100
        int rangeNumber = 75;

        if (rangeNumber >= 1 && rangeNumber <= 100) {
            System.out.println("5. The number is between 1 and 100.");
        } else {
            System.out.println("5. The number is outside the range.");
        }


        // 6. Show the day of the week using switch
        int day = 3;

        switch (day) {
            case 1:
                System.out.println("6. Monday");
                break;
            case 2:
                System.out.println("6. Tuesday");
                break;
            case 3:
                System.out.println("6. Wednesday");
                break;
            case 4:
                System.out.println("6. Thursday");
                break;
            case 5:
                System.out.println("6. Friday");
                break;
            case 6:
                System.out.println("6. Saturday");
                break;
            case 7:
                System.out.println("6. Sunday");
                break;
            default:
                System.out.println("6. Invalid day.");
        }


        // 7. Simulate a grading system
        int grade = 85;

        if (grade >= 90) {
            System.out.println("7. Outstanding");
        } else if (grade >= 60) {
            System.out.println("7. Passed");
        } else {
            System.out.println("7. Failed");
        }


        // 8. Check if the user can enter the cinema
        int cinemaAge = 14;
        boolean accompanied = true;

        if (cinemaAge >= 15 || accompanied) {
            System.out.println("8. You can enter the cinema.");
        } else {
            System.out.println("8. You cannot enter the cinema.");
        }


        // 9. Check if a letter is a vowel or consonant
        char letter = 'e';

        if (letter == 'a' || letter == 'e' || letter == 'i'
                || letter == 'o' || letter == 'u') {
            System.out.println("9. The letter is a vowel.");
        } else {
            System.out.println("9. The letter is a consonant.");
        }
    }
}

}
