import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWaterBottle {

    private WaterBottle waterBottle;
/*
    Create a water bottle class with a volume property.
    The volume should start at 100.
    Add a drink function that takes 10 from the volume each time it is called.
    Create an empty function that brings the volume down to 0.
    Create a fill function that fills the volume back to 100.
*/
    @Before
    public void before(){
        this.waterBottle = new WaterBottle();
    }
    @Test
    public void bottleIsFull(){
        assertEquals(100,waterBottle.getLevel());
    }
    @Test

    public void canDrinkBottle(){
        waterBottle.drink();
        assertEquals(90,waterBottle.getLevel());
    }
    @Test
    public void canEmptyBottle(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getLevel());
    }

    @Test
    public void canFillBottle(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100,waterBottle.getLevel());
    }
}
