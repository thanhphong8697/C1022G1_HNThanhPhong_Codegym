package AbtractClassAndInterface.Exercise.ColorableInterface;

import AbtractClassAndInterface.Exercise.ResizeableInterface.Resizeable;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Shape;

public class SquareColor extends ShapeColor implements Colorable {
    private double side;

    public SquareColor(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public SquareColor(double radius, double side) {
        super(radius);
        this.side = side;
    }

    public SquareColor(double width, double length, double side) {
        super(width, length);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (this.side * this.side);
    }

    @Override
    public String toString() {
        return "SquareColor{" +
                "side=" + side +
                '}';
    }
    @Override
    public void howToColor() {
        System.out.println("sda");
    }
}
