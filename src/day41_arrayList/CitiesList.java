package day41_arrayList;
import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        ArrayList <String> cities= new ArrayList<>();
        cities.add("Moscow");
        cities.add("Vienna");
        cities.add("Seattle");
        cities.add("Los Angeles");
        cities.add("New York");

        cities.add(0,"Kiev");

        System.out.println(cities);

    }
}
