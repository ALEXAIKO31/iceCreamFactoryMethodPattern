package mx.iteso.icefactory.stores;

import mx.iteso.icefactory.IceCream;
import mx.iteso.icefactory.Stores.WaterIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 23/10/2015.
 */
public class WaterIceCreamStoreTest {
    private WaterIceCreamStore waterIceCreamStore;
    private IceCream iceCream;

    @Before
    public void setUp(){
        waterIceCreamStore= new WaterIceCreamStore();
    }
    @Test
    public void testChocolateWater(){
        iceCream = waterIceCreamStore.orderIceCream("chocolate");
        iceCream.serve();
        assertEquals("Chocolate water ice cream with walnuts",iceCream.getDescription());
    }

    @Test
    public void testVanillaWater(){
        iceCream = waterIceCreamStore.orderIceCream("vanilla");
        iceCream.serve();
        assertEquals("Vanilla water ice cream with melted chocolate",iceCream.getDescription());
    }

    @Test
    public void testStrawberryWater(){
        iceCream = waterIceCreamStore.orderIceCream("strawberry");
        iceCream.serve();
        assertEquals("Strawberry water ice cream with chocolate chips",iceCream.getDescription());
    }

    @Test(expected =java.lang.NullPointerException.class)
    public void testNullWater() throws NullPointerException{
        iceCream = waterIceCreamStore.orderIceCream("not a flavor");
    }

}