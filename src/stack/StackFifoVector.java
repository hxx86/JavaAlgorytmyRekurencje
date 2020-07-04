package stack;

import java.util.Vector;

public class StackFifoVector {

    private StackFifoVersion version;
    private Vector<Integer> stack;

    public StackFifoVector(StackFifoVersion version) {
        this.version = version;
        stack = new Vector();

    }

    public int add(int value) {
        stack.add(value);
        return value;
    }

    public int pop() throws Exception {

        if (stack.isEmpty()) {
            throw new Exception("Stos jest pusty");
        }

        switch (version) {
            case FIFO:
                return stack.remove(0);
            case LIFO:
                return stack.remove(stack.size() - 1);
            default:
                throw new Exception("Coś poszło nie tak");
        }


    }

}
