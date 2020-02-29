package rekurencja;

public class Silnia {

    public static void main(String[] args) {

        System.out.println(silnia(4));


        int a = silniaRek(4);
    }

    private static int silnia(int liczba) {

        // 4! = 1 * 2 * 3 * 4

        int silnia = 1;
        int i = 0;

        while (i < liczba) {
            i = i + 1;
            silnia = silnia * i; // silnia = liczba * silnia(liczba - 1)
        }

        return silnia;

    }

    private static int silniaRek(int liczba) {

        int result = 0;

        if (liczba == 0) {
            result = 1;
        } else {
            result = liczba * silniaRek(liczba - 1);
        }

        return result;

        // int a = silniaRek(4);
        // result = 4 * silniaRek(4 - 1);
        // result = 3 * silniaRek(3 - 1);
        // result = 2 * silniaRek(2 - 1);
        // result = 1 * silniaRek(1 - 1);
        // result = 1;



    }
}
