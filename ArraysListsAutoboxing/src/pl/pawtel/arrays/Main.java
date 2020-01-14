package pl.pawtel.arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
//        int[] myIntArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i;
        }
        printArray(myIntArray);


    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("element " + i + ", value is " + array[i]);
        }
    }
}
