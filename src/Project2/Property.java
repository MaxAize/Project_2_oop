package Project2;

public abstract class Property {
    private String addres = "Na ,na";
    private double area = 0;
    private  double price = 0;

    public  Property(String addres, double area, double price){
        setAddres(addres);
        setArea(area);
        setPrice(price);
    }
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        if(addres.isEmpty())
        {
            return;
        }
        addres= addres.trim();
        String arr[]= addres.split(",");//חלוקה לבדיקה האם מורכב לפי 2 nhkho
        if(arr.length<2)
        {
            return;
        }
        this.addres = addres;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if(area<0) {
        return;
        }
        this.area = area;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if(price<0){
           return;
        }
        this.price = price;
    }
    public  abstract void taxlt();
    @Override
    public String toString() {
        return "The addres is "+getAddres()+" with the area  "+getArea()+" and price of "+getPrice();
    }
}
