package stack;

import java.util.Vector;

public class StackVector {
    Vector<Integer> stack;

    public StackVector() {
        stack = new Vector();
    }

    public int pop() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("Stos jest pusty");
        }

        return stack.remove(stack.size() - 1);
    }

    public int peek() throws Exception {
        if (stack.isEmpty()) {
            throw new Exception("Stos jest pusty");
        }

        return stack.get(stack.size() - 1);
    }

    public int search(int value) {
        int pozycja = 1;
        for (int i = stack.size() - 1; i >= 0; i--) {
            if (value == stack.get(i)) {
                return pozycja;
            }

            pozycja++;
        }

        return -1;
    }

    public int push(int value) {
        stack.add(value);
        return value;
    }

    public int getSize() {
        return -1;
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
