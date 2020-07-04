package stack;

import java.util.Iterator;
import java.util.Vector;

public class IteratorExample {

    public static void main(String[] args) {

        Vector a = new Vector<>();
        a.add(1);
        a.add(2);
        a.add(3);

        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
