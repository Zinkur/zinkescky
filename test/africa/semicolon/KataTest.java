package africa.semicolon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {



     @Test

     public void testThatKataClassCanReverseNumber(){
         Kata kata = new Kata();
        assertEquals(54321,kata.reverseNumber(12345));
     }
}


@Test
public void testThatKataCanDoFactorialOfNumbers() {
    Kata kata;
    assertEquals((6 * 5 * 4 * 3 * 2), kata.findFactorialOf(number6));
    }
}
