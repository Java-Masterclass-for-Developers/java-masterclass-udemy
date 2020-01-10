package pl.pawtel;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorki", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Car basicCar = new Car(true, 3, 50);
        basicCar.changeGear(1);
        System.out.println(basicCar.getGear());
        basicCar.changeSpeed(10);
        System.out.println(basicCar.getSpeed());

        Car sportCar = new SportCar(3, 50);
        sportCar.changeGear(1);
        System.out.println(sportCar.getGear());
        sportCar.changeSpeed(10);
        System.out.println(sportCar.getSpeed());
    }
}
