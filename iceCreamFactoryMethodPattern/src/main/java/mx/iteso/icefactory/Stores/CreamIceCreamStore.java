package mx.iteso.icefactory.Stores;

import mx.iteso.icefactory.IceCream;
import mx.iteso.icefactory.IceCreamStore;
import mx.iteso.icefactory.IceCreams.Cream.ChocolateCream;
import mx.iteso.icefactory.IceCreams.Cream.StrawberryCream;
import mx.iteso.icefactory.IceCreams.Cream.VanillaCream;

/**
 * Created by ALEX on 23/10/2015.
 */
public class CreamIceCreamStore extends IceCreamStore {

    @Override
    protected IceCream createIceCream(String flavor){
        if(flavor.equals("chocolate"))
            return new ChocolateCream();
        else if(flavor.equals("vanilla"))
            return new VanillaCream();
        else if(flavor.equals("strawberry"))
            return new StrawberryCream();
        return null;
    }

}
