package day50_inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticBlockDemo {
    static int num;

    public static class Inner{

    }

    static {
        System.out.println("Static initializer block");
        num = 10;
        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("Mazda", "Toyota", "Opel"));
        System.out.println(cars);
    }

    {
        System.out.println("Initializer block");
    }

    public StaticBlockDemo(){
        System.out.println("Cosntructor method");
        num+=5;
    }



}
