package stack;

public class FifoVectorExample {

    public static void main(String[] args) {

        FifoVector fifoVector = new FifoVector();

        try {
            fifoVector.enqueue(10);
            fifoVector.print();

            fifoVector.enqueue(5);
            fifoVector.print();

            fifoVector.enqueue(2);
            fifoVector.print();

            fifoVector.enqueue(1);
            fifoVector.print();

            System.out.println(fifoVector.peek());
            fifoVector.print();

            System.out.println(fifoVector.dequeue());
            fifoVector.print();

            System.out.println(fifoVector.isEmpty());

        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }

    }
}
