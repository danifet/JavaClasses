package unit1_assesment.hgfjf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec("a,b$c"));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        String reversed="";
        int count=0;
        ArrayList<Character> baku= new ArrayList<>();

        for( int i= 0; i<str.length(); i++){
            if (str.charAt(i)>=65 && str.charAt(i)<=122){
                baku.add (str.charAt(i));
            }
        }

        Collections.reverse (baku);
        for( int i= 0; i<str.length(); i++){
            if (str.charAt(i)<65 || str.charAt(i)>122){
                reversed+= str.charAt(i)+"";
            } else{
                reversed+=baku.get(count);
                count++;
            }
        }
        return reversed;


    }


}

