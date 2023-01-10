package AbtractClassAndInterface.Exercise.ColorableInterface;

import AbtractClassAndInterface.Exercise.ResizeableInterface.Resizeable;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Shape;

public class CircleColor extends ShapeColor {
    private double radius = 1.0;

    public CircleColor(double radius) {
        super(radius);
        this.radius = radius;
    }

    public CircleColor(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public CircleColor(double radius, double radius1) {
        super(radius);
        this.radius = radius1;
    }

    public CircleColor(double width, double length, double radius) {
        super(width, length);
        this.radius = radius;
    }

    public CircleColor(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"+this.getArea()+"}";
    }
}
