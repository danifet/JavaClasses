package day40_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListff {
    public static void main(String[] args) {
        ArrayList list1= new ArrayList();

        list1.add("java");
        System.out.println(list1);

        ArrayList <Integer> nums=new ArrayList<>(Arrays.asList(25,65,37));
        nums.add (5);
        nums.add(54);
        System.out.println(nums);

    }
}
