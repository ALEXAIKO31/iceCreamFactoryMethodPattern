package mx.iteso.icefactory.stores;

import mx.iteso.icefactory.IceCream;
import mx.iteso.icefactory.Stores.CreamIceCreamStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ALEX on 23/10/2015.
 */
public class CreamIceCreamStoreTest {

    private CreamIceCreamStore creamIceCreamStore;
    private IceCream iceCream;

    @Before
    public void setUp(){
        creamIceCreamStore= new CreamIceCreamStore();
    }
    @Test
    public void testChocolateCream(){
        iceCream = creamIceCreamStore.orderIceCream("chocolate");
        iceCream.serve();
        assertEquals("Chocolate cream ice cream with walnuts with raspberries",iceCream.getDescription());
    }

    @Test
    public void testVanillaCream(){
        iceCream = creamIceCreamStore.orderIceCream("vanilla");
        iceCream.serve();
        assertEquals("Vanilla cream ice cream with melted chocolate with almonds",iceCream.getDescription());
    }

    @Test
    public void testStrawberryCream(){
        iceCream = creamIceCreamStore.orderIceCream("strawberry");
        iceCream.serve();
        assertEquals("Strawberry cream ice cream with chocolate chips with almonds",iceCream.getDescription());
    }

    @Test(expected =java.lang.NullPointerException.class)
    public void testNullCream() throws NullPointerException{
        iceCream = creamIceCreamStore.orderIceCream("not a flavor");
    }

}
