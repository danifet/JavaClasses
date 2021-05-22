package day14_Multi_Branch_If_Statements;
import java.util.Scanner;
public class CalcualtorV1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        double num1=5.5;
        double num2=2.5;
        char operator= scan.next().charAt(0);
        if (operator== '+') {
            System.out.println(num1 + num2);
        }else if (operator == '-') {
            System.out.println(num1-num2);
        }else if (operator== '*') {
            System.out.println(num1*num2);
        }else if (operator=='/'){
            System.out.println (num1/num2);}
        else { System.out.println("Not a valid operator");}
                }


    }

