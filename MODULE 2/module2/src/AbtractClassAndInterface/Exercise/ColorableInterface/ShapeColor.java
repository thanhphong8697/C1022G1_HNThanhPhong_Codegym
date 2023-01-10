package AbtractClassAndInterface.Exercise.ColorableInterface;


public class ShapeColor{
    private String color = "green";
//    private boolean filled = true;


    public ShapeColor(String color, boolean filled) {
        this.color = color;
//        this.filled = filled;
    }

    public ShapeColor(double radius) {
    }

    public ShapeColor(double width, double length) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
