package Project2;

public class Commercial extends Property {

    private  boolean stroeroom=false;
    private  double yield =0.0;

    public Commercial(String addres, double area, double price, boolean stroeroom, double yield) {
        super(addres, area, price);
       setStroeroom(stroeroom);
       setYield(yield,price);
    }

    public Commercial(String addres, double area, double price, double yeild) {
        super(addres, area, price);
        setYield(yield,price);
    }




    public boolean isStroeroom() {
        return stroeroom;
    }

    public void setStroeroom(boolean stroeroom) {
        this.stroeroom = stroeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield,double price) {
        if(yield<0.0||price<0.0){
            return;
        }
        this.yield = ((yield/100)*price)/12;
    }

    @Override
    public void taxlt() {
        System.out.println("You need to pay "+getPrice()/100.0*10.0+" in taxes");
    }

    @Override
    public String toString() {
        return super.toString()+" ,commercial with yeild of "+getYield();
    }
}
