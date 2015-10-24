package mx.iteso.icefactory;

/**
 * Created by ALEX on 23/10/2015.
 */
public abstract class IceCream {

    public String description;

    public void serve(){
        System.out.println("Serving in cone, covered with chocolate =9");
    }

    public void add(String extra){
        System.out.println("adding extra "+extra);
        this.description+=(" with "+extra);
    }

    public String getDescription(){
        return description;
    }
}
