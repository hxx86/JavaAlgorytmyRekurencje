package euklides;

public class EuklidesOdejmowanie {

    public static void main(String... args) {

        int baseA = 378;
        int baseB = 214;

        int a = baseA;
        int b = baseB;

        int counter = 0;

        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }

            counter++;
        }

        System.out.println("NWD " + baseA + " i " + baseB + " = " + a);
        System.out.println("Ilość przebiegów: " + counter);

    }
}
