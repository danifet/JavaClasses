package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        List<Integer> kokk=Method2();
        System.out.println(kokk);
    }

    public static List<Integer> Method2(){
        List <Integer> koko = new ArrayList<>();
        for (int i=0; i<=1000000;i++){
            koko.add(i);
        }
               return koko;
    }
}
