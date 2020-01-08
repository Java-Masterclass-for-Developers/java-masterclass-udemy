package pl.pawtel.classes_constructors_inheritance;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4.0);
        System.out.println("Sum: " + simpleCalculator.getAdditionResult());
        System.out.println("Substract: " + simpleCalculator.getSubstractionResult());
        System.out.println("Multiply: " + simpleCalculator.getMultiplicationResult());
        System.out.println("Divide: " + simpleCalculator.getDivisionResult());
    }
}
