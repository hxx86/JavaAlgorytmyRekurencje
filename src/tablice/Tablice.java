package tablice;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

        int[] theVals = { 1, 2, 3, 4, 5, 7, 9, 10, 89, 456, 1111 };
        int[] obrocona = obroc(theVals);

        System.out.println(Arrays.toString(theVals));
        System.out.println(Arrays.toString(obrocona));
        System.out.println(suma(theVals));
        System.out.println(srednia(theVals));

    }

    private static int[] obroc(int[] tab) {

        int[] theVals = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            theVals[i] = tab[tab.length - 1 - i];
        }

        return theVals;
    }

    private static int suma(int[] tab) {

        int suma = 0;

        for (int val : tab) {
            suma += val;
        }

        return suma;

    }

    private static double srednia(int[] tab) {
        int suma = suma(tab);
        return (double)suma / tab.length;
    }
}
