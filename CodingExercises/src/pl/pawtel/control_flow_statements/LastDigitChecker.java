package pl.pawtel.control_flow_statements;

public class LastDigitChecker {

    public static void main(String[] args) {
        int one = 9;
        int two = 99;
        int three = 999;
        System.out.println(hasSameLastDigit(one, two, three));
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int one, int two, int three) {

        if ((!isValid(one)) || (!isValid(two)) || (!isValid(three)))
            return false;

        int rightDigitOfOne;
        int rightDigitOfTwo;
        int rightDigitOfThree;

        rightDigitOfOne = one % 10;
        rightDigitOfTwo = two % 10;
        rightDigitOfThree = three % 10;

        if (rightDigitOfOne == rightDigitOfTwo || rightDigitOfOne == rightDigitOfThree ||
                rightDigitOfTwo == rightDigitOfThree) {
            return true;
        }
        return false;
    }
}
