package Project2;

public abstract class Residential extends Property {
    private int parkingLots=0;
    public Residential(String addres, double area, double price, int parkingLots) {
        super(addres, area, price);
        this.parkingLots = parkingLots;
    }

    public int getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(int parkingLots) {
        if(parkingLots<0){
            return;
        }
        this.parkingLots = parkingLots;
    }

    @Override
    public void taxlt() {
        System.out.println("You need to pay "+getPrice()/100.0*8.0+" in taxes");
    }

    @Override
    public String toString() {
        return super.toString() +" ,number of parking lots "+getParkingLots() ;
    }
}
