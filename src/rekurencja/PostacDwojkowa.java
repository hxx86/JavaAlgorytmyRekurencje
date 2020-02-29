package rekurencja;

public class PostacDwojkowa {
    public static void main(String[] args) {
        int val = 1232235524;
        int modulo ;
        String result="";

        do {
            modulo=val%2;
            val=val/2;
            result=modulo+result;
            System.out.println(modulo);
        }while(val>0);




    }
}
