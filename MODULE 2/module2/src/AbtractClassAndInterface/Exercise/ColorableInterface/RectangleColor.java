package AbtractClassAndInterface.Exercise.ColorableInterface;

import AbtractClassAndInterface.Exercise.ResizeableInterface.Resizeable;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Shape;

public class RectangleColor extends ShapeColor {
    private double width = 1.0;
    private double length = 1.0;

    public RectangleColor(double width, double length) {
        super(width,length);
        this.width = width;
        this.length = length;
    }

    public RectangleColor(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public RectangleColor(double radius, double width, double length) {
        super(radius);
        this.width = width;
        this.length = length;
    }

    public RectangleColor(double width, double length, double width1, double length1) {
        super(width, length);
        this.width = width1;
        this.length = length1;
    }

    public RectangleColor(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * this.length;
    }

    @Override
    public String toString() {
        return "RectangleColor{"+this.getArea()+"}";
    }
}
