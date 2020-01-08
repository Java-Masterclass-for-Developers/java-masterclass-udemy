package pl.pawtel.control_flow_statements;

public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(5200));
        System.out.println(reverse(100));
        numberToWords(123);
        System.out.println("");
        numberToWords(1010);
        System.out.println("");
        numberToWords(1001);
        System.out.println("");
        numberToWords(10);
        System.out.println("");
        numberToWords(101);
        System.out.println("");
        numberToWords(145048972);
        System.out.println("");
        numberToWords(-12);
    }

    public static void numberToWords(int number) {

        int reversedNnumber = reverse(number);
        int numberOfDigits = getDigitCount(number);
        int numberOfDigitsInReversedNumber = getDigitCount(reversedNnumber);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (numberOfDigits == numberOfDigitsInReversedNumber) {

            int lastDigit;

            for (int i = 0; i < numberOfDigits; i++) {
                lastDigit = reversedNnumber % 10;
                reversedNnumber = reversedNnumber / 10;
                switch (lastDigit) {
                    case 0:
                        System.out.print("Zero");
                        System.out.print(" ");
                        continue;
                    case 1:
                        System.out.print("One");
                        System.out.print(" ");
                        continue;
                    case 2:
                        System.out.print("Two");
                        System.out.print(" ");
                        continue;
                    case 3:
                        System.out.print("Three");
                        System.out.print(" ");
                        continue;
                    case 4:
                        System.out.print("Four");
                        System.out.print(" ");
                        continue;
                    case 5:
                        System.out.print("Five");
                        System.out.print(" ");
                        continue;
                    case 6:
                        System.out.print("Six");
                        System.out.print(" ");
                        continue;
                    case 7:
                        System.out.print("Seven");
                        System.out.print(" ");
                        continue;
                    case 8:
                        System.out.print("Eight");
                        System.out.print(" ");
                        continue;
                    case 9:
                        System.out.print("Nine");
                        System.out.print(" ");
                        continue;
                    default:
                        System.out.print("Bad switch...check it.");
                }
                System.out.print(" ");
            }
        } else {

            int lastDigit;
            int digitsDiff = numberOfDigits - numberOfDigitsInReversedNumber;

            if (numberOfDigitsInReversedNumber > 0) {

                for (int i = 0; i < numberOfDigitsInReversedNumber; i++) {
                    lastDigit = reversedNnumber % 10;
                    reversedNnumber = reversedNnumber / 10;

                    switch (lastDigit) {
                        case 0:
                            System.out.print("Zero ");
                            continue;
                        case 1:
                            System.out.print("One ");
                            continue;
                        case 2:
                            System.out.print("Two ");
                            continue;
                        case 3:
                            System.out.print("Three ");
                            continue;
                        case 4:
                            System.out.print("Four ");
                            continue;
                        case 5:
                            System.out.print("Five ");
                            continue;
                        case 6:
                            System.out.print("Six ");
                            continue;
                        case 7:
                            System.out.print("Seven ");
                            continue;
                        case 8:
                            System.out.print("Eight ");
                            continue;
                        case 9:
                            System.out.print("Nine ");
                            continue;
                        default:
                            System.out.print("Bad switch...check it.");
                    }
                }
            }

            for (int i = 0; i < digitsDiff; i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int reverse(int numberToReverse) {

        int reverse = 0;

        while (numberToReverse != 0) {
            int lastDigit = numberToReverse % 10;
            reverse = reverse * 10 + lastDigit;
            numberToReverse /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        if (number < 0)
            return -1;

        int digitCount = 1;

        for (int i = 0; i <= number && number >= 10; i++) {
            number = number / 10;
            digitCount++;
        }
        return digitCount;
    }
}
