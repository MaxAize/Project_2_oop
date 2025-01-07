package Project2;

public class Villa extends Residential{
    private  int levels=1;

    public Villa(String addres, double area, double price, int parkingLots, int levels) {
        super(addres, area, price, parkingLots);
        setLevels(levels);
    }


    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if(levels<1){
            return;
        }
        this.levels = levels;
    }

    @Override
    public String toString() {
        return super.toString()+" ,villa with "+getLevels()+" levels";
    }
}
