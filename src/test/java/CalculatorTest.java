import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {
        this.calculator = new Calculator();
    }
    @Test
    public void add(){
        assertEquals(5, this.calculator.add(2,3));
    }
    @Test
    public void subtract() {
        assertEquals(1, this.calculator.subtract(5,4));
    }
    @Test
    public void multiply(){
        assertEquals(15, this.calculator.multiply(5,3));
    }
    @Test
    public void divide(){
        assertEquals(0.5, this.calculator.divide(1,2), 0.0);
    }

}
