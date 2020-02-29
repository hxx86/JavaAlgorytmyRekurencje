package sortowanie;

import java.util.Arrays;

public class Sortowanie {

    public static void main(String[] args) {

        int[] tab = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        InsertSort.sort(tab);

        System.out.println(Arrays.toString(tab));

        int[] tab2 = { 54, 26, 93, 17, 77, 31, 44, 55, 20 };
        BubbleSort.sort(tab2);

        System.out.println(Arrays.toString(tab));

    }
}
