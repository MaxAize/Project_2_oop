package Project2;

import java.util.ArrayList;
import java.util.Properties;

public class RealEstateManager {
    private String name;
    private ArrayList<Property> properties=new ArrayList();

    public RealEstateManager(String name) {
        this.name = name;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public void setProperties(ArrayList<Property> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void addProperty(Property property)
    {
        getProperties().add(property);
    }
    public ArrayList<Property> byPrice(double price)
    {   ArrayList<Property> prr=new ArrayList();
        for(Property p :getProperties()){
            if(p.getPrice()<=price){
                prr.add(p);
            }
        }
        return prr;
    }
    public  double getSum(){
        double sum=0.0;
        for(Property p :getProperties()) {
            sum += p.getPrice();
        }
        return  sum;
    }
}
