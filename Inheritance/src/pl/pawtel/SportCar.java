package pl.pawtel;

public class SportCar extends Car {

    private boolean fourWheel;
    private boolean sportTyres;
    private boolean chipTuning;

    public SportCar(int gear, int speed) {
        super(true, gear, speed);
        this.fourWheel = true;
        this.sportTyres = true;
        this.chipTuning = true;
    }

    public boolean isFourWheel() {
        return fourWheel;
    }

    public boolean isSportTyres() {
        return sportTyres;
    }

    public boolean isChipTuning() {
        return chipTuning;
    }

    @Override
    public void changeGear(int change) {
        super.changeGear(change);
        setGear(this.getGear() + 1);
    }

    @Override
    public void changeSpeed(int speedChange) {
        super.changeSpeed(speedChange);
        setSpeed(this.getSpeed() + 15);
    }
}
