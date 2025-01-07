package Project2;

public class Office extends Property{
    public Office(String addres, double area, double price) {
        super(addres, area, price);
    }
    @Override
    public void taxlt() {
        System.out.println("You need to pay "+getPrice()/100.0*10.0+" in taxes");
    }

    @Override
    public String toString() {
        return super.toString()+" ,office.";
    }
}
