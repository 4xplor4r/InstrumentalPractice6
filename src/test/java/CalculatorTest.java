import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void additional() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void subtraction() {
        assertEquals(7, calc.sub(11, 4));
    }

    @Test
    public void multiplication() {
        assertEquals(21, calc.mul(7, 3));
    }

    @Test
    public void division() {
        assertEquals(8, calc.div(40, 5));
    }

    @Test
    public void checkSolver() {
        assertEquals(7, calc.solver(3) );
    }
}