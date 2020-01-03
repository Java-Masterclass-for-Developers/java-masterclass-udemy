package pl.pawtel;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        double test = calcFeetAndInchesToCentimeters(0, 12);
        System.out.println(test);

        double test2 = calcFeetAndInchesToCentimeters(157);
        System.out.println(test2);

        int numbersSum = sumOfNumbers(1, 2, 3, 4);
        System.out.println(numbersSum);
    }

    public static int sumOfNumbers(int numberFirst, int... number) {
        int result = numberFirst;

        for (int i = 0; i < number.length; i++) {
            result += number[i];
        }
        return result;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = ((int) inches / 12);
        double remainingInches = (int) inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name no player scored ");
        return 0;
    }
}
