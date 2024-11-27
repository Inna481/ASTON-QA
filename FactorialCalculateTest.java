import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialCalculateTest {
    @Test
    public void testPositiveNumber (){
        assertEquals(40320, FactorialCalculate.factorial(8));
        assertEquals(720, FactorialCalculate.factorial(6));
    }

    @Test
    public void testZero (){
        assertEquals(1, FactorialCalculate.factorial(0));
    }

    @Test
    public void testNegativeNumber (){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculate.factorial(-3);
        });
        assertEquals("Отрицательные числа недопустимы", exception.getMessage());
    }

    @Test
    public void testLargeNumber (){
        assertEquals(39916800, FactorialCalculate.factorial(11));
    }
}
