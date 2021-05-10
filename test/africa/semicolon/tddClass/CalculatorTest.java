package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void testcalculatorCanAddTest() {
        Calculator myCalculator = new Calculator();
        int result = myCalculator.add(2, 6);
        assertEquals(8, result);
        assertTrue(result == 8);
    }
        @Test
                public void testThatCalculatorCanMultiply(){
            //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(3,4);
        //confirm
            assertEquals(12,result);
        }


}
