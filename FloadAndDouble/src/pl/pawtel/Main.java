package pl.pawtel;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN: " +myMinFloatValue);
        System.out.println("Float MAX: " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN: " +myMinDoubleValue);
        System.out.println("Double MAX: " +myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue= " + myFloatValue);
        System.out.println("MyDoubleValue= " + myDoubleValue);

        //Challenge
        double pounds = 10d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
