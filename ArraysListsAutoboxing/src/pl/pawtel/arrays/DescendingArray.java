package pl.pawtel.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] unsortedArray = new int[5];

        getIntegers(unsortedArray);

        printArray(unsortedArray);

        descendingArraySort(unsortedArray);
    }

    public static void getIntegers(int[] array) {

        for (int i = 0; i < array.length; i++) {

            System.out.println("Please insert number");
            array[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Numbers in array: " + array[i]);
        }
    }

    public static void descendingArraySort(int[] array) {

        Arrays.sort(array);
        System.out.println("Descending sort:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
