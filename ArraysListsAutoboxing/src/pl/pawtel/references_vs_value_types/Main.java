package pl.pawtel.references_vs_value_types;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("anotherIntValue: " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        anotherArray [0]= 1;

        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(anotherArray));
    }
}
