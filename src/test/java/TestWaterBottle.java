import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWaterBottle {

    private WaterBottle waterBottle;

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
