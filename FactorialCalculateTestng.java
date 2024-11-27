import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialCalculateTestng {

    @Test
    public void testPositiveNumber (){
        assertEquals(FactorialCalculate.factorial(8), 40320);
        assertEquals(FactorialCalculate.factorial(6),  720);

    }
    @Test
    public void testZero(){
        assertEquals(FactorialCalculate.factorial(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNegativeNumber(){
        FactorialCalculate.factorial(-3);
    }

    @Test
    public void testLargeNumber(){
        assertEquals(FactorialCalculate.factorial(11), 39916800);
    }
}
