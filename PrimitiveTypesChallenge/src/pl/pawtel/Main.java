package pl.pawtel;

public class Main {

    public static void main(String[] args) {
        byte chByte = 120;
        short chShort = 30000;
        int chInt = 500_000;
        long chLong = 50_000L + (10L * (chByte + chShort + chInt));
        System.out.println(chLong);
        long maxLong = Long.MAX_VALUE;
        System.out.println(maxLong);
    }
}
