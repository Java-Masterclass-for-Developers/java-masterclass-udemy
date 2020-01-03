package pl.pawtel.expressions_statements_methods.barking_dog;

public class BarkingDog {
    public static void main(String[] args) {

        boolean wakeUp = shouldWakeUp(false, 2);
        System.out.println(wakeUp);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfTheDay) {

        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;
        } else if (!barking) {
            System.out.println("dog is not barking");
        } else return hourOfTheDay < 8 || hourOfTheDay > 22;
        return false;
    }
}
