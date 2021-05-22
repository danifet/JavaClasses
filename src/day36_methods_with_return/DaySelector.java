package day36_methods_with_return;

import java.util.*;

class Main {

        public static String mergeStrings(String one, String two) {
            String great="";
            int less=0;
            for (int i=0, k=0; i<Math.min(one.length(),two.length());i++,k++){
                great+= one.charAt(i)+""+two.charAt(k);
                less++;
            }
            if (one.length()>two.length()){
                return great+=one.substring (less);
            } return great+=two.substring (less);


        }

        public static void main(String[] args) {
             System.out.println(mergeStrings("java", "cricket"));
        }

    }


