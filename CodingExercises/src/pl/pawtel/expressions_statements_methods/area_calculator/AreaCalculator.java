package pl.pawtel.expressions_statements_methods.area_calculator;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1, 5.0));
    }

    public static double area(double radius) {
        if (radius < 0)
            return -1.0;

        return Math.pow(radius, 2) * Math.PI;
    }

    public static double area(double xSide, double ySide) {
        if (xSide < 0 || ySide < 0)
            return -1.0;

        return xSide * ySide;
    }
}
