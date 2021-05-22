package unit1_assesment;

import java.util.Random;
import java.util.Scanner;

class Main {
   public static void main(String[]args){
       String source= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
       Random random = new Random();

       for(int i=0; i<=18;i++)
       {
           int index =random.nextInt(71);
           System.out.print(source.charAt(index));
       }
        }
    }
