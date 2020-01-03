package pl.pawtel;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 5000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //CHALLENGE
        score = 50;
        displayHighScorePosition("Adam", calculateHighScorePosition(score));

        score = 500;
        displayHighScorePosition("Tim", calculateHighScorePosition(score));

        score = 900;
        displayHighScorePosition("Peter", calculateHighScorePosition(score));

        score = 1500;
        displayHighScorePosition("Anna", calculateHighScorePosition(score));
    }

    public static void displayHighScorePosition(String playerName, int positionInHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + positionInHighScoreTable +
                " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//            return 4;

        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 1;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            return finalScore;

        }
        return -1;
    }
}

