package Inheritance.Exercise.CircleClassAndCylinderClass;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return (getArea() * this.height);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                "height=" + height +
                ", area='" + getArea() +
                ", volume='" + getVolume() +
                '}';
    }
}
