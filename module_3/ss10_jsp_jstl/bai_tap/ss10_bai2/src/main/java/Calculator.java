public class Calculator {
    public static double calculate(double numberOne, String option, double numberTwo) {
        switch (option) {
            case "addition":
                return numberOne + numberTwo;
            case "subtraction":
                return numberOne - numberTwo;
            case "multiplication":
                return numberOne * numberTwo;
            case "division":
                if (numberTwo == 0) {
                    throw new NumberFormatException();
                } else {
                    return numberOne / numberTwo;
                }
            default:
                return 0;
        }
    }
}
