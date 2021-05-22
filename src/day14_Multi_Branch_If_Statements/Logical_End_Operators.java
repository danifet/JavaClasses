package day14_Multi_Branch_If_Statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Logical_End_Operators {
public static void main(String [] args) {
    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    System.out.println(10 > 5 && 1 == 1); // TRUE. TRUE+TRUE=TRUE
    System.out.println(99 < 100 && 22 > 25); //false
    System.out.println(3 > 2 && 5 > 2); // TRUE
    System.out.println(10 > 15 && 5>10); //FALSE

    int apples = 10, oranges = 5;
    boolean check = apples > 5 && oranges >3;
    System.out.println("check = " + check);

    if (apples > 6 && oranges >2) {
        System.out.println("I have enough apples and oranges");
    } else {
        System.out.println("I need to go to Walmart to buy some fruits");
    }



}
}
