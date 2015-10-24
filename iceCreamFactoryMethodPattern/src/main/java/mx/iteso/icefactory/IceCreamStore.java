package mx.iteso.icefactory;

import mx.iteso.icefactory.IceCream;

/**
 * Created by ALEX on 23/10/2015.
 */
public abstract class IceCreamStore {

    public IceCream orderIceCream(String flavor){
        IceCream iceCream;

        iceCream = createIceCream(flavor);

        iceCream.serve();

        return iceCream;
    }
    protected abstract IceCream createIceCream(String flavor);
}