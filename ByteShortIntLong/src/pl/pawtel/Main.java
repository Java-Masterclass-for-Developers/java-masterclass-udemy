package pl.pawtel;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer MIN = " + myMinIntValue); // -2147483648
        System.out.println("Integer MAX = " + myMaxIntValue); // 2147483647
        System.out.println("MAX UNDERFLOW = " + (myMinIntValue - 1)); // 2147483647
        System.out.println("MAX OVERFLOW = " + (myMaxIntValue + 1)); // -2147483648

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN = " + myMinByteValue);
        System.out.println("Byte MAX = " + myMaxByteValue);

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short MIN = " + myMinShortValue);
        System.out.println("Short MAX = " + myMaxShortValue);


        long longValue = 1000L;
        Long myMinLongValue = Long.MIN_VALUE;
        Long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long MIN = " + myMinLongValue);
        System.out.println("Long MAX = " + myMaxLongValue);

        int myTotoal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
