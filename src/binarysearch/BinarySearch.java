package binarysearch;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {

        Random random = new Random();
        int notFoundNumber = random.nextInt(20);

        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // System.out.println(search(tab, 7));

        System.out.println("Szukam " + notFoundNumber);

        int indeks = searchRek(tab, notFoundNumber, 0, tab.length - 1);
        if (indeks == -1) {
            System.out.println("Nie znaleziono elementu " + notFoundNumber+ " w tablicy " + Arrays.toString(tab));
        } else {
            System.out.println("Znalazłem element " + notFoundNumber + " w tablicy na indeksie " + indeks);
        }
    }

    /**
     *
     * @param tab
     * @param searchNumber
     * @return indeks szukanego elementu lub -1 gdy nie znaleziono
     */
    private static int search(int[] tab, int searchNumber) {

        int left = 0;
        int right = tab.length - 1;

        while (left <= right) {
            int srodek = (left + right) / 2;

            if (tab[srodek] == searchNumber) {
                return srodek;
            }

            if (tab[srodek] > searchNumber) {
                right = srodek - 1;
            } else {
                left = srodek + 1;
            }
        }

        return -1;

    }

    private static int searchRek(int[] tab, int searchNumber, int left, int right) {

        if (left > right) {
            return -1;
        }

        int srodek = (left + right) / 2;

        if (tab[srodek] == searchNumber) {
            return srodek;
        }

        if (tab[srodek] > searchNumber) {
            right = srodek - 1;
        } else {
            left = srodek + 1;
        }

        return searchRek(tab, searchNumber, left, right);

    }
}
