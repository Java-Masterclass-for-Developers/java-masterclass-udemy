package pl.pawtel;

public class DigitSumChallenge {

    public static void main(String[] args) {

        int number = 125;
        System.out.println("Sum of digits in number " + number + " is " + sumDigits(number));
    }

    public static int sumDigits(int number) {

        if (number < 10)
            return -1;

        int sum = 1;
        int digit;

        while (number > 10) {
            digit = number % 10;
            sum += digit;
            // drop the least-significant digit
            number = number / 10;
        }
        return sum;
    }
}
