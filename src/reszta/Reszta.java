package reszta;

public class Reszta {

    public static void main(String[] args) {

        wydajeReszte(259);

    }

    private static void wydajeReszte(int reszta) {

        int[] nominaly = {100, 50, 20, 10, 5, 2, 1};

        for(int nominal : nominaly) {

            if (nominal <= reszta) {
                int krotnosc = 0;

                do {
                    reszta = reszta - nominal;
                    krotnosc++;
                } while (reszta >= nominal);

                System.out.println("Krotność: " + krotnosc + ", nominał: " + nominal);
            }
        }
    }
}
