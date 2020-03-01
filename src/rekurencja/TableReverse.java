package rekurencja;

import java.util.Arrays;

public class TableReverse {

    public static void main(String[] args) {

        int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Arrays.toString(tab));

//        int index = 0;
//        while (index <= tab.length / 2) {
//
//            int firstTmp = tab[index];
//            int lastTmp = tab[tab.length - 1 - index];
//
//            tab[index] = lastTmp;
//            tab[tab.length - 1 - index] = firstTmp;
//
//            index++;
//
//        }

        reverse(tab, 0);
        System.out.println(Arrays.toString(tab));

    }

    private static void reverse(int[] tab, int index) {

        if (index > tab.length / 2) {
            return;
        }

        int lastIndex = tab.length - 1 - index;

        int firstTmp = tab[index];
        tab[index] = tab[lastIndex];
        tab[lastIndex] = firstTmp;

        reverse(tab, index + 1);

    }

}
