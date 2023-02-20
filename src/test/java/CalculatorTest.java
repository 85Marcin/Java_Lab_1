import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void add (){

        assertEquals(5, calculator.addNumbers(2, 3));}


    @Test
    public void subtract() {
        assertEquals(4, calculator.subtractNumbers(6,2));}

    @Test
    public void multiply(){ assertEquals(16, calculator.multiplyNumbers(4,4));}

    @Test
    public void divide(){
        assertEquals(2, calculator.divideNumbers(8.0, 4.0), 0.0);
    }
    }