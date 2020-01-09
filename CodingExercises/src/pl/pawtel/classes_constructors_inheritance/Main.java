package pl.pawtel.classes_constructors_inheritance;

public class Main {
    public static void main(String[] args) {
        // test for SimpleCalculator
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.setFirstNumber(5.0);
        simpleCalculator.setSecondNumber(4.0);
        System.out.println("Sum: " + simpleCalculator.getAdditionResult());
        System.out.println("Substract: " + simpleCalculator.getSubstractionResult());
        System.out.println("Multiply: " + simpleCalculator.getMultiplicationResult());
        System.out.println("Divide: " + simpleCalculator.getDivisionResult());

        // test for Person
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

       // test for Wall
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
