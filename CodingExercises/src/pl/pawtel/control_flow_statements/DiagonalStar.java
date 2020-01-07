package pl.pawtel.control_flow_statements;

public class DiagonalStar {

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {

        if (number < 5)
            System.out.println("Invalid Value");
        else {
            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || col == 1 || row == col || row == number || col == number || (row + col) == number + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}