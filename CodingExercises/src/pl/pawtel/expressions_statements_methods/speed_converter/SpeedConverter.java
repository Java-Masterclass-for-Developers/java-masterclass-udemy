package pl.pawtel.expressions_statements_methods.speed_converter;

public class SpeedConverter {
    public static void main(String[] args) {
        long test = toMilesPerHour(25.42);
        System.out.println(test);
        printConversion(10.25);

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        double multiplier = 1.609;
        double milesPerHour = Math.round(kilometersPerHour / multiplier);

        if (milesPerHour < 0) {
            System.out.println("Invalid Value");
        } else
            System.out.println(kilometersPerHour + " km/h = " + (int) milesPerHour + " mi/h");
    }
}
