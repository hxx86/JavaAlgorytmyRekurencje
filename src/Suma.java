import java.util.Scanner;

public class Suma {

    public static void main(String... args) {

        Scanner scanner = new Scanner(System.in);

//        int a = scanner.nextInt();
        int suma = 0;
//
//        while (a != 0) {
//
//            a = scanner.nextInt();
//            suma += a;
//
//        }

        int a;

        do {
            a = scanner.nextInt();
            suma += a;
        } while (a != 0);

        System.out.println(suma);

    }

}
