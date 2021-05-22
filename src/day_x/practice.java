package day_x;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName= email.substring (0, email.indexOf("_"));
        String lastName= email.substring (email.indexOf("_")+1,email.indexOf("@"));

        System.out.println (lastName+"_"+firstName);
            System.out.println (email.substring(email.indexOf ("@")));
        }


    }
