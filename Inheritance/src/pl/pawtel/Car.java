package pl.pawtel;

public class Car {

    private boolean handSteering;
    private int gear;
    private int speed;

    public Car(boolean handSteering, int gear, int speed) {
        this.handSteering = handSteering;
        this.gear = gear;
        this.speed = speed;
    }

    public boolean isHandSteering() {
        return handSteering;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeGear(int change) {

        if (change < 0) {
            System.out.println("gear shifted down");
            gear--;
        } else if (change == 0) {
            System.out.println("Gear not changed");
        } else
            System.out.println("Gear shifted up");
        gear++;
    }

    public void changeSpeed(int speedChange) {

        if (speedChange < 0) {
            System.out.println("Slowing down");
            speed--;
        } else if (speed == 0) {
            System.out.println("Speed not changed");
        } else
            System.out.println("Speeding up");
        speed += 10;
    }
}
