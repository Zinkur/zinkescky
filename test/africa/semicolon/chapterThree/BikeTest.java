package africa.semicolon.chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void testThatSpeedCanBeSet(){
        //given
        Bike okada = new Bike();
        //when
        okada.setSpeedInKmPerHour(15);
        //confirm
        assertEquals(15,okada.getSpeedInKmPerHour());
    }
}
