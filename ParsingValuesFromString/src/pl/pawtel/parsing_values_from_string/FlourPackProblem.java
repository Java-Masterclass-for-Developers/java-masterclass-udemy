package pl.pawtel.parsing_values_from_string;

public class FlourPackProblem {

    public static void main(String[] args) {

        System.out.println(canPack(1, 0, 4)); // false
        System.out.println(canPack(1, 0, 5)); // true
        System.out.println(canPack(0, 5, 4)); // true
        System.out.println(canPack(2, 2, 11)); // true
        System.out.println(canPack(-3, 2, 12)); // false
        System.out.println(canPack(1, 0, 6)); // false
        System.out.println(canPack(5, 3, 24)); // false
        System.out.println(canPack(2, 1, 5)); // true
        System.out.println(canPack(0, 5, 6)); // false
        System.out.println(canPack(4, 8, 19)); // true
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (((bigCount * 5) + (smallCount)) < goal) {
            return false;
        }

        int bigRest = goal % 5;

        if (bigRest > smallCount) {
            return false;
        }
        return true;
    }
}