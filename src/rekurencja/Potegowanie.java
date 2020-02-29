package rekurencja;

public class Potegowanie {

    public static void main(String... args) {

        poteguj(4, 5);
//        // 4 * 4 * 4 * 4 * 4 = 4^5
//        int potega = 1;
//
//        for (int i = 0; i < 5; i++) {
//            potega = potega * 4;
//        }
//
//        potega = 1;
//        int j = 0;
//        while (j < 5) {
//            potega = potega * 4;
//
//            j++;
//        }

    }

    private static int poteguj(int podstawa, int potega) {

        // 4 * potega(4^4)
        // 4 * 4 * potega(4^3)
        // 4 * 4 * 4 * potega(4^2)
        // 4 * 4 * 4 * 4 * potega(4^1)
        // 4 * 4 * 4 * 4 * 4 * potega(4^0)

        // potega == 0
        if (potega == 1) {
            return podstawa;
        } else {
            return podstawa * poteguj(podstawa, potega - 1);
        }
    }
}
