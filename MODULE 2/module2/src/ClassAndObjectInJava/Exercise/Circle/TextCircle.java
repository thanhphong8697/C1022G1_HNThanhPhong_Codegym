package ClassAndObjectInJava.Exercise.Circle;

public class TextCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2);
        System.out.println("Radius of Circle is: " + circle1.getRadius());
        System.out.println("Area of Circle is: " + circle1.getArea());
        System.out.println(circle1.toString());
    }
}
