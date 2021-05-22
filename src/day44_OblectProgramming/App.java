package day44_OblectProgramming;

import java.util.ArrayList;

public class App {
    String name;
    Double version;

    public  void open(String koko){
        System.out.println("The app is being updated to "+version);
    }

    public static void main(String[] args) {
        App app1= new App();
        App app2= new App();
        app1.name= "Google Maps";
        app2.name= "Jobber";
        app1.version= 5.02;
        app2.version= 13.65;
        app1.open("the Moon");
        ArrayList <String> koko= new ArrayList<>();

    }

}
