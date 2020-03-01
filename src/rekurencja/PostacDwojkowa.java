package rekurencja;

public class PostacDwojkowa {

    public static void main(String[] args) {

        int val = 13;
        int modulo;
        String result = "";

        do {

            modulo = val % 2;
            val = val / 2;

            result = modulo + result;

        } while (val > 0);

        result = parse(val, result);

        System.out.println(result);

    }

    private static String parse(int val, String result) {

        if (val == 0) {
            return result;
        }

        int modulo = val % 2;

        return parse(val / 2, modulo + result);

    }

}
