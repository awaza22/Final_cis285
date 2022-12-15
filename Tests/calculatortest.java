
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class calculatortest {
        @Test
        public void test() {
            testintegers();
            testMax();
            testMin();
        }
        calculator calculator = new calculator();
    @Test
    public void testintegers()
    {
        int value = calculator.add(5, 3);
        assertEquals (8,value);
    }

    @Test
    public void testMax()
    {
        int value = calculator.add(156600, 2);
        assertEquals (156602,value);
    }
    @Test
    public void testMin()
    {
        int value = calculator.add(-156600, 2);
        assertEquals (-156598,value);
    }


}
