package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
       List<String> dayday=getDays();
        System.out.println(dayday);
    }

    public static List<String> getDays(){
        List<String> days= new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        return days;
    }
}
