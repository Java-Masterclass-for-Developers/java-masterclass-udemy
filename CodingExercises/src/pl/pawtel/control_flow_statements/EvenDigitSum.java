package pl.pawtel.control_flow_statements;

public class EvenDigitSum {

    public static void main(String[] args) {
        int testNumber = -22;
        System.out.println(getEvenDigitSum(testNumber));
    }

    public static int getEvenDigitSum(int number) {

        int temporary = 0;
        int sum = 0;

        if (number < 0) {
            return -1;
        } else {
            while (number > 0) {
                temporary = number % 10;
                if ((temporary % 2) == 0) {
                    sum += temporary;
                }
                number = number / 10;
            }
            return sum;
        }
    }
}
