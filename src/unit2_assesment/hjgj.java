package unit2_assesment;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        int balance = 100;
        if(item.equalsIgnoreCase("Blanket")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-60)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Charger")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-25)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Hat")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-25)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Headphones")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-30)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Pants")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-50)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Pillow")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-40)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("Socks")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-5)+"$");
        }else if(balance>0 && item.equalsIgnoreCase("USB cable")){
            System.out.println("Thank you for your purchase!\nYour current balance is: "+(balance-10)+"$");
        }else if(item.equalsIgnoreCase("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equalsIgnoreCase("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else {
            System.out.println("Invalid item!");
        }

        System.out.println(item.equalsIgnoreCase("koko loko"));

    }
}