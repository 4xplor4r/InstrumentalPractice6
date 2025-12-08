public class Calculator {

    public static void main(String[] args) {
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        if (b == 0) throw new IllegalArgumentException("You can't divide by 0");
        return a / b;
    }

    public double solver(int x) {
        double y = add(x, 4);
        y = mul(3, x);
        y = sub(x, 5);
        y = div(2, x);
        // the equation: y = (3 * (x + 4) - 5) / 2
        return y;
    }
}
