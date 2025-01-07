package Project2;

public class Vacation extends Residential{
    private int guests=1;
    public Vacation(String addres, double area, double price, int parkingLots, int guests) {
        super(addres, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if(guests<1) {
            return ;
        }
        this.guests = guests;
    }
    @Override
    public void taxlt() {
        System.out.println("You need to pay "+getPrice()/100.0*25.0+" in taxes");
    }

    @Override
    public String toString() {
        return super.toString()+" ,vacation house with "+getGuests()+" guests";
    }
}
