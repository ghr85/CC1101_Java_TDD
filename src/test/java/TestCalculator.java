import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestCalculator {
    private Calculator calculator;

    @Before
    public void before(){
    this.calculator = new Calculator();
    }
    @Test
    public void canAdd(){
    assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(1, calculator.subtract(3,2));
    }

    @Test
    public void canDivide(){
        assertEquals(3,calculator.divide(12,4));
    }
    @Test
    public void canMultiply(){
        assertEquals(12, calculator.multiply(3,4));
    }


}
