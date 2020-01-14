package pl.pawtel.references_vs_value_types;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementChallenge {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count:");
        int count = scanner.nextInt();
        scanner.nextLine();

        findMin(readIntegers(count));
    }

    public static int[] readIntegers(int count) {

        int[] enteredNumbers = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.println("enter number into console");
            int number = scanner.nextInt();
            scanner.nextLine();
            enteredNumbers[i] = number;
        }
        System.out.println(Arrays.toString(enteredNumbers));
        scanner.close();
        return enteredNumbers;
    }

    public static void findMin(int[] array) {
        Arrays.sort(array);
        System.out.println("Lowest value is: " + array[0]);
    }
}
