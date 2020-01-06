package pl.pawtel.control_flow_statements;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(9));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int perfectNumber = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectNumber += i;
            }
        }
        if (perfectNumber == number)
            return true;
        else return false;
    }
}
