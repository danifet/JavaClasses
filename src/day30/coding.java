package day30;

public class coding {
    public static void main(String[] args) {
        int [] nums = new int[] {2,7,1};
        System.out.println(has271(nums));

    }


    public static boolean has271(int[] nums) {
        boolean what=false;
        if (nums.length>3){
            for (int i=0; i<nums.length-2; i++){
                if (nums[i+1]==nums[i]+5 && (nums[i+2]== nums[i]-1 || nums[i+2]== nums[i]-2 || nums[i+2]== nums[i]||nums[i+2]== nums[i]-3||nums[i+2]== nums[i]+1 )){
                    what=true;
                    break;
                }
            }
        }
        return what;
    }


}
