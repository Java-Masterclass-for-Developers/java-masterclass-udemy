package pl.pawtel;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        //   for (int i = 1; i < 7; i++) {
        //     System.out.println("Count value is " + count);
        //}

        // proper for loop
        for (count = 1; count != 5; count++) {
            System.out.println("Count value is " + count);
        }

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 5);

        System.out.println(isEvenNumber(10));

        //different approach to test isEvenNumber method
        int number = 4;
        int endOfSearch = 20;
        int evenNumbersFound = 0;

        while (number <= endOfSearch) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            evenNumbersFound++;
            System.out.println("Even number: " + number);

            if (evenNumbersFound == 5) {
                System.out.println("********");
                System.out.println("Number of even numbers; " + evenNumbersFound);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            System.out.println(number);
            return true;
        }
        return false;
    }

}
