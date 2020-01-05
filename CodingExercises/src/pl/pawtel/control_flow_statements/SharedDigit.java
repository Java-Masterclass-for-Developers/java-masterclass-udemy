package pl.pawtel.control_flow_statements;

public class SharedDigit {

    public static void main(String[] args) {
        int testNumberOne = 13;
        int testNumberTwo = 53;
        System.out.println(hasSharedDigit(testNumberOne, testNumberTwo));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        int firstDigitOfOne;
        int secondDigitOfOne;
        int firstDigitOfTwo;
        int secondDigitOfTwo;

        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        }

        secondDigitOfOne = numberOne % 10;
        firstDigitOfOne = numberOne / 10;
        secondDigitOfTwo = numberTwo % 10;
        firstDigitOfTwo = numberTwo / 10;

        return firstDigitOfOne == firstDigitOfTwo || firstDigitOfOne == secondDigitOfTwo
                || secondDigitOfOne == firstDigitOfTwo || secondDigitOfOne == secondDigitOfTwo;
    }
}

