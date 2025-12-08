import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void additional() {
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    public void subtraction() {
        assertEquals(4, calc.sub(7, 3));
    }

    @Test
    public void multiplication() {
        assertEquals(21, calc.mul(7, 3));
    }

    @Test
    public void division() {
        assertEquals(3, calc.div(21, 7));
    }

    @Test
    public void checkSolver() {
        assertEquals(12.5, calc.solver(6) );
    }
}