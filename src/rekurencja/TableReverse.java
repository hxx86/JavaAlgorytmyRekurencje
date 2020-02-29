package rekurencja;


import java.util.Arrays;

public class TableReverse {
    public static void main(String[] args) {
        int[]tab={1,2,3,4,5,6,7,8,9};
        int[]reverse=new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            reverse[reverse.length-1-i]=tab[i];

        }
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(reverse));



    }
}
