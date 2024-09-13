import org.junit.Test;
import static org.junit.Assert.*;


public class ExampleTest {
    //Function A testing
    @Test public void testFunctionAYPositive(){
        Example expl = new Example(5, 10);
        assertEquals("FunctionA when Y is positive",7, expl.Function_A(2));
    }
    @Test public void testFunctionAYNegative(){
        Example expl = new Example(5, 10);
        assertEquals("FunctionA when Y is negative",-7, expl.Function_A(-2));
    }
    //Function B testing
    @Test public void testFunctionBxLowerThan6(){
        Example expl = new Example(5, 10);
        assertEquals("FunctionB when X is lower than 6",15, expl.Function_B(5));
    }
    @Test public void testFunctionBxHigherThan6(){
        Example expl = new Example(5, 10);
        assertEquals("FunctionB when X is higher than 6",-3, expl.Function_B(7));
    }
}