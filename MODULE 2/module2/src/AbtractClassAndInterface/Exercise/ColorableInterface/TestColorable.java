package AbtractClassAndInterface.Exercise.ColorableInterface;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Circle;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Shape;

import java.util.Scanner;

public class TestColorable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeColor[] shapeColors = new ShapeColor[3];
        System.out.println("Nhập bán kính của hình tròn");
        double radius = Integer.parseInt(scanner.nextLine());
        shapeColors[0] = new CircleColor(radius);
        System.out.println("Nhập chiều rộng của hình chữ nhật");
        double width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều dài của hình chữ nhật");
        double length = Integer.parseInt(scanner.nextLine());
        shapeColors[1] = new RectangleColor(width, length);
        System.out.println("Nhập độ dài cạnh của hình vông");
        double side = Integer.parseInt(scanner.nextLine());
        shapeColors[2] = new ShapeColor(side);
        System.out.println(shapeColors[0].toString());
        System.out.println(shapeColors[1].toString());
        System.out.println(shapeColors[2].toString());
        for (ShapeColor shapeColor : shapeColors) {
            if (shapeColor instanceof SquareColor) {
                SquareColor squareColor = (SquareColor) shapeColor;
                squareColor.howToColor();
            }
        }
    }
}
