package ObjectOrientedPrograming.Exercise.Equation;

import java.util.Scanner;

public class BuildQuadraticEquationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        double numb1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number2");
        double numb2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter number3");
        double numb3 = Integer.parseInt(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(numb1, numb2, numb3);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println(delta);
        if (delta > 0) {
            System.out.println("The equation has two solutions:");
            System.out.println("Solutions 1: " + quadraticEquation.getRoot1());
            System.out.println("Solutions 2: " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("equation with double solution (solutions 1 = solutions 2): " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
