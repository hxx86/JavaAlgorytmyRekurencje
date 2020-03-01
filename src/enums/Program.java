package enums;

public class Program {
    public static void main(String[] args) {
        Kolor kolor =Kolor.CZERWONY;
        int kolor2=2;
        switch (kolor){
            case CZERWONY:
                System.out.println("kolor czerwony");
                break;
            case ZIELONY:
                System.out.println("kolorzielony");
                break;
            case Niebieski:
                System.out.println("kolor niebieski");
                break;

        }
    }
}
