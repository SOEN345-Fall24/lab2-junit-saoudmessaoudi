import org.junit.Test;
import static org.junit.Assert.*;


public class ExampleTest {
    @Test public void testFunctionAYPositive(){
        Example expl = new Example(5, 10);
        assertEquals(7, expl.Function_A(2));
    }
}