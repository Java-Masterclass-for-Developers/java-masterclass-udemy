package pl.pawtel.control_flow_statements;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long average = 0;

        while (true) {
            // System.out.println("Enter a number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                sum += scanner.nextInt();
                counter++;
            } else {
                average = Math.round((double) sum / counter);
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
