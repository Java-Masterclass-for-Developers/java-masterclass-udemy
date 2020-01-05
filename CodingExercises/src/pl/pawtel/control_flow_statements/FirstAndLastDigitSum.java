package pl.pawtel.control_flow_statements;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        int number = 123425;
        System.out.println(sumFirstAndLastDigit(number));
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        int firstDigit = 0;
        int sumOfFirstAndLastDigit = 0;

        if (number < 0)
            return -1;

        while (number >= 0) {
            lastDigit = number % 10;
            break;
        }

        while (number > 0) {
            firstDigit = number % 10;
            // drop the least-significant digit
            number = number / 10;
        }
        return sumOfFirstAndLastDigit = firstDigit + lastDigit;
    }
}