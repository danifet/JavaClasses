package day32_arrays_split;

import java.util.Arrays;
import java.util.Scanner;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-----Find the index of Gloves in items array-----");
        for (int i=0; i< items.length-1;i++)
        {
            if (items [i].equals ("Gloves")){
            System.out.println("Gloves found at index "+i);
            }
        }

        System.out.println("print a report of each shopping item");
        for (int i=0; i< items.length;i++){
            System.out.print ("\""+items[i]+"\"" +"-"+prices[i]+"$ "+itemIDs[i]+"\n " );

            for (double each:prices){
                each+=each;


                   Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO Type your code below:
            boolean tr= false;
            Arrays.sort(nums);
            for(int l=0; l<nums.length-1; l++){
                if (nums[l]==nums[l+1]&&nums[l]==5){
                    tr=true;
                    break;
                } tr=false;
            }
            System.out.println (tr);



        }
}}}
