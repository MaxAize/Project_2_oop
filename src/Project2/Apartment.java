package Project2;

public class Apartment extends  Residential{
    int rooms=1;
    public Apartment(String addres, double area, double price, int parkingLots, int rooms) {
        super(addres, area, price, parkingLots);
        setRooms(rooms);
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        if(rooms<1){
            return;
        }
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return super.toString()+ ", apartment with "+getRooms()+ "rooms";
    }
}
