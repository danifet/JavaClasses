package day31_char_arrays;

public class CharArray {
    public static void main (String [] args){
        char [] letters= {'j', 'a', 'v', 'a', ' ', 'i', 's', 'f', 'u', 'n'};
        for (char num:letters) {
            System.out.print(num);
        }
            String github= "facktory";
            char[] item= github.toCharArray();
            System.out.println("\n"+item.length);
            for(char iko:item){
                System.out.print(iko+" ");
            }

    }
}
