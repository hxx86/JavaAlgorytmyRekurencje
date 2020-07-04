package rekurencja;

public class Palindrom {

    public static void main(String[] args) {

        String val = "kajal";

        int index = 0;
        boolean czyPalindrom = true;

//        while (index <= val.length() / 2) {
//
//            if (val.charAt(index) != val.charAt(val.length() - 1 - index)) {
//                czyPalindrom = false;
//                break;
//            }
//
//            index++;
//        }

        czyPalindrom(val, 0);

        if (czyPalindrom) {
            System.out.println(val + " jest palindromem");
        } else {
            System.out.println(val + " nie jest palindromem");
        }
    }

    private static boolean czyPalindrom(String val, int index) {

        if (index > val.length() / 2) {
            return true;
        }

        if (val.charAt(index) != val.charAt(val.length() - 1 - index)) {
            return false;
        }

        return czyPalindrom(val, index + 1);
    }

}
