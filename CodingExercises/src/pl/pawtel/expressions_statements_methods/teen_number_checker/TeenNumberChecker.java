package pl.pawtel.expressions_statements_methods.teen_number_checker;

public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean test = hasTeen(9, 99, 19);
        System.out.println(test);
        boolean isTeenCheck = isTeen(9);
        System.out.println(isTeenCheck);
    }

    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        if ((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19) || (ageThree >= 13 && ageThree <= 19))
            return true;
        return false;
    }

    public static boolean isTeen(int age) {
        if (age >= 13 && age <= 19)
            return true;
        return false;
    }
}
