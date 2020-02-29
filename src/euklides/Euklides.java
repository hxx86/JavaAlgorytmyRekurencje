package euklides;

import java.util.Scanner;

public class Euklides {

    public static void main(String... args) {
        euklidesModulo(378, 214);
        euklidesOdejmowanie(378, 214);

        Scanner scanner = new Scanner(System.in);
        scanner.next();
    }

    private static void euklidesModulo(int a, int b) {
        int baseA = a;
        int baseB = b;
        int c;

        int counter = 0;

        while (b > 0) {
            c = b;
            b = a % b;
            a = c;

            counter++;
        }

        System.out.println("NWD dla liczb " + baseA + " i " + baseB + " to " + a);
        System.out.println("Ilość przebiegów algorytmu: " + counter);
    }

    private static void euklidesOdejmowanie(int a, int b) {
        int baseA = a;
        int baseB = b;

        int counter = 0;

        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }

            counter++;
        }

        System.out.println("NWD dla liczb " + baseA + " i " + baseB + " to " + a);
        System.out.println("Ilość przebiegów algorytmu: " + counter);
    }

}
