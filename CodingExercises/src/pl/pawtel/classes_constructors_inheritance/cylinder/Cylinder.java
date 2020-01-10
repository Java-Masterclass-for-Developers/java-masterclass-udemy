package pl.pawtel.classes_constructors_inheritance.cylinder;

import pl.pawtel.classes_constructors_inheritance.cylinder.Circle;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {

        return Math.pow(getRadius(), 2) * Math.PI * height;
    }
}
