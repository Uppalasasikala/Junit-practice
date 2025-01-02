import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testCalcAdd()
    {
        assertEquals(4,Calculator.add(1,3));
    }

    @Test
    public void testCalcSubtract()
    {
        assertEquals(3,Calculator.subtract(6,3));
    }

    @Test
    public void testCalcMultiply()
    {
        assertEquals(6,Calculator.multiply(2,3));
    }

    @Test
    public void testCalcDivide()
    {
        assertEquals(4,Calculator.divide(8,2));
    }
}
