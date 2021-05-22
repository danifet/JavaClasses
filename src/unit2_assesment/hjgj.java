package unit2_assesment;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[][] matrix = {{11,7,4},{1,5,7},{10,1,-12}};
        int result = 0;
        int sum1=matrix [0][0];
        int sum2=matrix [0][matrix[0].length-1];

        for (int i=1,k=1;i< matrix.length; i++,k++){

            sum1+= matrix [i][k] ;
            sum2+= matrix [i][matrix[i].length-1-k];

        }

        result = Math.abs (sum1-sum2);

        String koko= new String();




        // FINAL PRINT
        System.out.println( koko);
    }
}