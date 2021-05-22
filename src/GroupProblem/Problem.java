package GroupProblem;
import java.util.*;


public class Problem {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        String one= scan.next();
        String two= scan.next();
        String newStrings= "";
        int k=0;

        String [] first= one.split ("");
        String [] second= two.split ("");

        if (first.length > second.length){
            for (int i=0; i< second.length; i++){
                newStrings+= first[i]+second[i];
                k++;
            }
            newStrings+= one.substring (k);
        } else if (first.length < second.length){
            for (int i=0; i< first.length; i++){
                newStrings+= first[i]+second[i];
                k++;
            }
            newStrings+= one.substring (k);
        } else {
            for (int i=0; i< first.length; i++){
                newStrings+= first[i]+second[i];
        }
        System.out.println(newStrings);
    }
}}
