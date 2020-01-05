package pl.pawtel.control_flow_statements;

public class NumberPalindrome {

    public static void main(String[] args) {
        int number = -7071;
        System.out.println(isPalindrome(number));
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int initialNumber = number;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        if ((initialNumber == reverse)) {
            return true;
        }
        return false;
    }
}

