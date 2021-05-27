package day_11;

import java.util.Scanner;
class Main {


    public static boolean isPalindrome(String check) {
        StringBuilder reverse = new StringBuilder();
        for (int i = check.length()-1; i >=0 ; i--) {
            // 01234
            // abcde    //madam - \
            // edcba    //madam - /
            reverse.append(check.charAt(i));
        }
        reverse = new StringBuilder(reverse.toString().replace(" ", ""));
        check = check.replace(" ", "");
        return reverse.toString().equalsIgnoreCase(check);

    }

    public static void main(String[] args) {

        // race car
        Scanner scan = new Scanner(System.in);
        System.out.println(isPalindrome(scan.nextLine()));

    }

}