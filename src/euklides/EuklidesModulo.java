package euklides;

public class EuklidesModulo {

    public static void main(String... args) {

        int baseA = 378;
        int baseB = 214;

        int a = baseA;
        int b = baseB;
        int c;
        int counter = 0;

        while (b > 0) {
            c = b;
            b = a % b;
            a = c;

            counter++;
        }

        System.out.println("NWD " + baseA + " i " + baseB + " = " + a);
        System.out.println("Ilość przebiegów: " + counter);
    }

}
