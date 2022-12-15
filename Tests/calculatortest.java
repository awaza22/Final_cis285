
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class calculatortest {
        @Test
        public void test() {
            testintegers();
           // testMax();
           // testMin();
        }
        calculator calculator = new calculator();
    @Test
    public void testintegers()
    {
        int value = calculator.add(5, 3);
        assertEquals (8,value);
    }



}
