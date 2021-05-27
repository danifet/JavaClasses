package day_x;

import java.util.Scanner;


class Main {

    public static boolean isPalindrome(String check) {

        // your code here
        boolean bool= false;
        check= check.replace (" ","").toLowerCase();
        for (int i=0; i<check.length()/2;i++){
            if (check.charAt(i)==check.charAt(check.length() -1-i)){
                bool=true;
            } else {
                bool=false;
                break;
            }
        }
        return bool;

    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }

}
