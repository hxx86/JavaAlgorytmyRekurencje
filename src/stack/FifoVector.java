package stack;

import java.util.Vector;

public class FifoVector {

    Vector<Integer> stack;

    public FifoVector() {
        stack = new Vector();
    }

    public int dequeue() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("Stos jest pusty");
        }

        return stack.remove(0);
    }

    public int peek() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("Stos jest pusty");
        }

        return stack.get(0);
    }

    public int enqueue(int value) {
        stack.add(value);
        return value;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
            if (i < stack.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

}
