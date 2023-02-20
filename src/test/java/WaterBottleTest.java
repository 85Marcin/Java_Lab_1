import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void isVolume100(){
        assertEquals(true, waterBottle.checkVolumeIs100());
    }
    @Test
    public void drink(){
        assertEquals(90, waterBottle.drinkWater());
    }

    @Test
    public void drinkAll(){
        assertEquals(0, waterBottle.drinkAllWater());
    }

    @Test
    public void fillTheBottle(){
        assertEquals(100, waterBottle.fillUpTheBottleTo100());
    }

}
