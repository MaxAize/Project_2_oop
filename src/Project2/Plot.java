package Project2;

public class Plot extends Property {
    public enum TYPE{URBAN,AGRICULTURAL,INDUSTRIAL}



    protected TYPE type;
    public  Plot(String addres, double area, double price,TYPE type){
    super(addres,area,price);
    setType(type);
    }

    public TYPE getType() {
        return type;
    }
    public void setType(TYPE type) {

      this.type=type;
    }

    @Override
    public String toString() {
        return super.toString()+" , property type: "+getType().name();
    }
    @Override
    public void taxlt() {
       switch (getType()){
           case URBAN:
               System.out.println("You need to pay "+getPrice()/100.0*10.0+" in taxes");
               return;
           case INDUSTRIAL:
               System.out.println("You need to pay "+getPrice()/100.0*5.0+" in taxes");
               return;
           case AGRICULTURAL:
               System.out.println("You need to pay "+getPrice()/100.0*2.0+" in taxes");
               return;
       }
    }
}
