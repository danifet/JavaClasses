package day33;

import java.util.Arrays;
import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (i<nums.length-1&&nums[i]==nums[i+1]){
                i++;
            } else if(i==nums.length-1){
                System.out.println (nums[nums.length-1]);
            } else {
                System.out.println (nums[i]);

            }
        }
    }}
