package stack;

public class StackTabExample {

    public static void main(String[] args) {

        StackTab stackTab = new StackTab(10);

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
