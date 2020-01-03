package pl.pawtel.expressions_statements_methods.equal_sum_checker;

public class EqualSumChecker {
    public static void main(String[] args) {
        boolean test = hasEqualSum(1, -1, 0);
        System.out.println(test);
    }

    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree) {

        int sumOfTwoFirstNumbers = numberOne + numberTwo;
        if (sumOfTwoFirstNumbers == numberThree)
            return true;
        return false;
    }
}
