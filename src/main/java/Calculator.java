public class Calculator {

    public static void main(String[] args) {}

    public double add(double a, double b) { return a + b; }

    public double sub(double a, double b) { return a - b; }

    public double mul(double a, double b) { return a * b; }

    public double div(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("You can't divide by 0");
        return a / b;
    }

    public double solver(double x) {  // double arg
        // the equation: y = (7 * (x + 1) - 7) / 3
        double result = div(sub(mul(7, add(x, 1)), 7), 3);  // one line
        return result;
    }
}
