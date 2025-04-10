package ro.ulbs.paradigme.lab6.problema2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new NewIntCalculator(0);
    }

    @Test
    public void testAddPositive() {
        calculator.add(1);
        calculator.add(2);
        assertEquals((int) (calculator.state), 3);
    }

    @Test
    public void testAddNegatives() {
        calculator.add(-1);
        calculator.add(-2);
        assertEquals((int) (calculator.state), -3);
    }

    @Test
    public void testSubtractPositives() {
        calculator.add(1);
        calculator.subtract(2);
        assertEquals((int) (calculator.state), -1);
    }

    @Test
    public void testSubtractNegatives() {
        calculator.add(-1);
        calculator.subtract(-2);
        assertEquals((int) (calculator.state), 1);
    }

    @Test
    public void testMultiplyPositives() {
        calculator.add(1);
        calculator.multiply(2);
        assertEquals((int) (calculator.state), 2);
    }

    @Test
    public void testMultiplyNegatives() {
        calculator.add(-1);
        calculator.multiply(-2);
        assertEquals((int) (calculator.state), 2);
    }

    @Test
    public void testMultiplyBy0() {
        calculator.add(5);
        calculator.multiply(0);
        assertEquals((int) (calculator.state), 0);
    }

    @Test
    public void testDividePositives() {
        calculator.add(4);
        calculator.divide(2);
        assertEquals((int) (calculator.state), 2);
    }

    @Test
    public void testDivideNegatives() {
        calculator.add(-6);
        calculator.divide(-2);
        assertEquals((int) (calculator.state), 3);
    }

    @Test
    public void testDivideBy0() {
        calculator.add(5);

        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(0));
        Assertions.assertNotNull(exception);

    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }


}
