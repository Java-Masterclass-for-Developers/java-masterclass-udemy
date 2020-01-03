package pl.pawtel;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult); // remains 3

        result = result * 10; // 2 * 10 = 20
        System.out.println("20 / 5 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // ABBREVIATION operators
        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 +1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 =" + result);

        //result = +2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Greater or both of the conditions are true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // OPERATOR CHALLENGE
        double numberOne = 20.00d;
        double numberTwo = 80.00d;
        double resultOne = (numberOne + numberTwo) * 100d;
        System.out.println("My values total: " + resultOne);
        double remainderOne = resultOne % 40.00d;
        boolean isRemainderZero = (remainderOne == 0) ? true : false;
        System.out.println("Is remainderOne equal to zero: " + isRemainderZero);
        if (!isRemainderZero){
            System.out.println("Got some reminder");
        }
    }
}
