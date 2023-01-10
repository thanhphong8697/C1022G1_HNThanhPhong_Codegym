package ObjectOrientedPrograming.Exercise.Equation;

public class QuadraticEquation {
    double numbA, numbB, numbC;

    public QuadraticEquation(double a, double b, double c) {
        this.numbA = a;
        this.numbB = b;
        this.numbC = c;
    }

    public double getDiscriminant() {
        return Math.pow(numbB, 2) - 4 * numbA * numbC;
    }

    public double getRoot1() {
        return (-numbB + Math.sqrt(this.getDiscriminant())) / (2 * numbA);
    }

    public double getRoot2() {
        return (-numbB - Math.sqrt(this.getDiscriminant())) / (2 * numbA);
    }
}
