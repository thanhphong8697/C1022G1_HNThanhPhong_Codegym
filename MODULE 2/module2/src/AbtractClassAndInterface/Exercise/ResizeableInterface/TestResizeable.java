package AbtractClassAndInterface.Exercise.ResizeableInterface;

import java.util.Scanner;

public class TestResizeable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần trăm tăng diện tích");
        double percent = Integer.parseInt(scanner.nextLine());
        Shape[] shapes = new Shape[3];
        System.out.println("Nhập bán kính của hình tròn");
        double radius = Integer.parseInt(scanner.nextLine());
        shapes[0] = new Circle(radius);
        System.out.println("Nhập chiều rộng của hình chữ nhật");
        double width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều dài của hình chữ nhật");
        double length = Integer.parseInt(scanner.nextLine());
        shapes[1] = new Rectangle(width, length);
        System.out.println("Nhập độ dài cạnh của hình vông");
        double side = Integer.parseInt(scanner.nextLine());
        shapes[2] = new Square(side);
        for (Shape shape : shapes){
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                circle.resize(percent);
            }else if (shape instanceof Rectangle){
                Rectangle rectangle = (Rectangle) shape;
                rectangle.resize(percent);
            }else {
                Square square = (Square) shape;
                square.resize(percent);
            }
        }
    }
}
