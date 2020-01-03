package pl.pawtel.expressions_statements_methods.decimal_comparator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DecimalCcomparator {

    public static void main(String[] args) {
        boolean test = areEqualByThreeDecimalPlaces(3.1756, 3.175);
        System.out.println(test);
    }

    public static boolean areEqualByThreeDecimalPlaces(double myNumberOne, double myNumberTwo) {

        if (myNumberOne == 0.0 && myNumberTwo == 0.0) {
            return true;
        } else if (myNumberOne == 0.0 || myNumberTwo == 0.0) {
            return false;
        } else if (myNumberOne != 0.0 && myNumberTwo != 0.0) {
            BigDecimal bd = BigDecimal.valueOf(myNumberOne).setScale(3, RoundingMode.DOWN);
            BigDecimal bd2 = BigDecimal.valueOf(myNumberTwo).setScale(3, RoundingMode.DOWN);
            if (bd.equals(bd2)) {
                return true;
            }
        }
        return false;
    }
}
