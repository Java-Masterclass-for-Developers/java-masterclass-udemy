package pl.pawtel.expressions_statements_methods.leap_year_calculator;

public class LeapYear {
    public static void main(String[] args) {

        int year = 2020;
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if ((year % 100 == 0)) {
                if (year % 400 == 0) {
                    return true;
                } else
                    return false;
            }
            return true;
        }
        return false;
    }
}


