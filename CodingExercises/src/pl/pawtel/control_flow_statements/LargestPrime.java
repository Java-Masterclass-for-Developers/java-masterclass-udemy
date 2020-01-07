package pl.pawtel.control_flow_statements;

public class LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(6)); // 3
        System.out.println(getLargestPrime(15)); // 5
        System.out.println(getLargestPrime(392832)); //32
        System.out.println(getLargestPrime(1)); // 1
        System.out.println(getLargestPrime(-1)); // -1
        System.out.println(getLargestPrime(0)); // -1
        System.out.println(getLargestPrime(2)); // 2
    }

    public static int getLargestPrime(int number) {

        int i;

        if (number <= 0) {
            return -1;

        } else if (number == 1) {
            return -1;

        } else {
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number /= i;
                    i--;
                }
            }
        }
        return i;
    }
}
