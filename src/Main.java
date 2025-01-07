import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import Project2.*;
import Data.DataManager;
import Exception.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
  static RealEstateManager m=new RealEstateManager("Josh");

    private static void propertiesList(double price) {
        try {
            if (price < 0) {
                throw new PriceException("Price cannot be negative!!!");
            }
            ArrayList<Property> p = m.byPrice(price);
            if (p.size()==0) {
                System.out.println("No properties under this price");
            }
            else {
                for (Property property : p) {
                    System.out.println(property);
                }
            }
        } catch (PriceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void financialReport() {
        for (Property p : m.getProperties()) {
            System.out.println(p);
            p.taxlt();
        }
    }

    private static void commercialYield() {
        double totalYield = 0;
        for (Property p : m.getProperties()) {
            if (p instanceof Commercial) {
                Commercial c = (Commercial) p;
                totalYield += c.getYield();
                System.out.println(c + ", Monthly Yield: " + c.getYield());
            }
        }
        System.out.println("Total Commercial Yield: " + totalYield);
    }

    private static boolean containsCity(String cityInput, Property p) {
        String fixedInput = cityInput.replaceAll("[-]", " ").trim().toLowerCase();
        String city = extractCityFromAddress(p.getAddres());
        return city.contains(fixedInput);
    }
    private static String extractCityFromAddress(String address) {
        if (address == null || address.isEmpty()) {
            return "";
        }
        String[] parts = address.split(",");
        return parts[0].replaceAll("[-]", " ").trim().toLowerCase();
    }
    private static void propertiesByCity(String cityInput) {
        ArrayList<Property> matchedProperties = new ArrayList<>();

        for (Property property : m.getProperties()) {
            if (containsCity(cityInput, property)) {
                matchedProperties.add(property);
            }
        }

        if (matchedProperties.isEmpty()) {
            System.out.println("No properties in the specified city.");
        } else {
            System.out.println("Properties in " + cityInput + ":");
            for (Property property : matchedProperties) {
                System.out.println(property);
            }
        }
    }

    private static void numberOfCities() {
        HashSet<String> cities = new HashSet<>();
        for (Property p : m.getProperties()) {
            String city = extractCityFromAddress(p.getAddres());
            if (!city.isEmpty()) {
                cities.add(city);
            }
        }

        System.out.println("Number of different cities: " + cities.size());
        System.out.println("Cities: " + String.join(", ", cities));
    }

    public static void main(String[] args) {
       m.setProperties(DataManager.getData());
       Scanner scanner =new Scanner(System.in);
       int i=4;

       while ( i!=6){
       System.out.println("To find Property by price enter 1");
       System.out.println("For financial report enter 2 ");
       System.out.println("For Commercial real estate yield enter 3");
       System.out.println("For properties by city enter 4");
       System.out.println("For number of cities enter 5");
       System.out.println("To end enter 6");
       i= scanner.nextInt();
       switch (i)
       {
           case 1:
               System.out.println("Enter price");
               double price=scanner.nextDouble();
               propertiesList(price);
               break;
           case 2:
               financialReport();
               break;
           case 3:
               commercialYield();
               break;
           case 4:
               System.out.println("Enter city");
               scanner.nextLine();
               String s=scanner.nextLine();
               propertiesByCity(s);
               break;
           case 5:
               numberOfCities();
               break;
           case 6:
               System.out.println("Danke for using us");
               break;
           default: System.out.println("Wrong input!!");
           break ;
       }
       System.out.println("------------------------");
       }
        }
    }
