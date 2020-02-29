package rekurencja;

import java.util.Scanner;

public class Paindrom {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 1 wyraz: ");
        String a = sc.nextLine();
        int h = a.length();

        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {

            if (a.charAt(i) != a.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }

        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }

    }
}