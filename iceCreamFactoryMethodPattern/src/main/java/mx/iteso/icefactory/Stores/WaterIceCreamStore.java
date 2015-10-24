package mx.iteso.icefactory.Stores;

import mx.iteso.icefactory.IceCream;
import mx.iteso.icefactory.IceCreamStore;
import mx.iteso.icefactory.IceCreams.Water.ChocolateWater;
import mx.iteso.icefactory.IceCreams.Water.StrawberryWater;
import mx.iteso.icefactory.IceCreams.Water.VanillaWater;

/**
 * Created by ALEX on 23/10/2015.
 */
public class WaterIceCreamStore extends IceCreamStore {

    @Override
    protected IceCream createIceCream(String flavor){
        if(flavor.equals("chocolate"))
            return new ChocolateWater();
        else if(flavor.equals("vanilla"))
            return new VanillaWater();
        else if(flavor.equals("strawberry"))
            return new StrawberryWater();
        return null;
    }

}
