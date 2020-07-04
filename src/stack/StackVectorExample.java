package stack;

import java.util.Vector;

public class StackVectorExample {

    public static void main(String[] args) {

        StackVector stackTab = new StackVector();

        try {
            stackTab.push(10);
            stackTab.print();

            stackTab.push(5);
            stackTab.print();

            stackTab.push(2);
            stackTab.print();

            stackTab.push(1);
            stackTab.print();

            System.out.println(stackTab.peek());
            stackTab.print();

            System.out.println(stackTab.pop());
            stackTab.print();

            System.out.println(stackTab.search(10));

        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
