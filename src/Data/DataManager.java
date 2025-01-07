package Data;
import  Project2.*;

import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Property> getData()
    {
        ArrayList<Property> properties = new ArrayList<>();

        // מגרשים
        properties.add(new Plot("Tel Aviv, Herzl 10", 500, 2000000, Plot.TYPE.URBAN));
        properties.add(new Plot("Givat Hashlosha, Kibbutz", 1200, 800000, Plot.TYPE.AGRICULTURAL));

        // דירות מגורים
        properties.add(new Apartment("Haifa, Allenby 34", 85, 1500000, 1, 3));
        properties.add(new Apartment("Ramat Gan, Bialik 22", 65, 1200000, 1, 2));

        // וילות
        properties.add(new Villa("Kfar Saba, Weizman 18", 250, 3500000, 2, 2));
        properties.add(new Villa("Jerusalem, Yehuda Hanasi 45", 320, 5000000, 3, 3));

        // דירות נופש
        properties.add(new Vacation("Eilat, Ben Gurion 12", 50, 600000, 1, 4));
        properties.add(new Vacation("Ein Bokek, Dead Sea Resort 1", 70, 800000, 1, 6));

        // נדל"ן מסחרי
        properties.add(new Commercial("Herzliya, Hataasiya 10", 400, 2000000, true, 8.0));
        properties.add(new Commercial("Ashdod, Business Park 3", 300, 1500000, false, 6.0));

        // משרדים
        properties.add(new Office("Tel Aviv, Ayalon 20", 100, 1000000));
        properties.add(new Office("Beer Sheva, Independence 12", 80, 750000));

        return properties;
    }
}
