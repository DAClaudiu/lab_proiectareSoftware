package ro.ulbs.paradigme.lab6.problema2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DoubleCalculator(0.0);
    }

    @Test
    public void testAddPositive() {
        calculator.add(1.0);
        calculator.add(2.0);
        assertEquals((Double) (calculator.state), 3.0);
    }

    @Test
    public void testAddNegatives() {
        calculator.add(-1.0);
        calculator.add(-2.0);
        assertEquals((Double) (calculator.state), -3.0);
    }

    @Test
    public void testSubtractPositives() {
        calculator.add(1.0);
        calculator.subtract(2.0);
        assertEquals((Double) (calculator.state), -1.0);
    }

    @Test
    public void testSubtractNegatives() {
        calculator.add(-1.0);
        calculator.subtract(-2.0);
        assertEquals((Double) (calculator.state), 1.0);
    }

    @Test
    public void testMultiplyPositives() {
        calculator.add(1.0);
        calculator.multiply(2.0);
        assertEquals((Double) (calculator.state), 2.0);
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.add(-1.0);
        calculator.multiply(-2.0);
        assertEquals((Double) (calculator.state), 2.0);
    }

    @Test
    public void testMultiplyBy0() {
        calculator.add(5.0);
        calculator.multiply(0.0);
        assertEquals((Double) (calculator.state), 0.0);
    }

    @Test
    public void testDividePositives() {
        calculator.add(4.0);
        calculator.divide(2.0);
        assertEquals((Double) (calculator.state), 2.0);
    }

    @Test
    public void testDivideNegatives() {
        calculator.add(-6.0);
        calculator.divide(-2.0);
        assertEquals((Double) (calculator.state), 3.0);
    }

    @Test
    public void testDivideBy0() {

        calculator.add(5.0);
        calculator.divide(0.0);
        assertEquals((Double) calculator.state, Double.POSITIVE_INFINITY);

    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
