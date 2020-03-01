package stack;

import javax.lang.model.util.ElementScanner6;

public class StackTab {

    int[] stack;
    int currentIndex;

    public StackTab(int size) {
        stack = new int[size];
    }

    public int pop() throws Exception {
        if (currentIndex == 0) {
            throw new Exception("Stos jest pusty");
        }

        currentIndex--;
        return stack[currentIndex];
    }

    public int peek() throws Exception {
        if (currentIndex == 0) {
            throw new Exception("Stos jest pusty");
        }

        return stack[currentIndex - 1];
    }

    public int search(int value) {
        // stack[currentIndex - 1] - szczyt stosu

        // [1, 2, 3, 4, _, _, _, _] size == 8
        // stos ma wysokość 4
        // pierwsza pozycja - 4
        // druga pozycja - 3
        // itd

        int pozycja = 1;
        for (int i = currentIndex - 1; i >= 0; i--) {
            if (value == stack[i]) {
                return pozycja;
            }

            pozycja++;
        }

        return -1;
    }

    public int push(int value) throws Exception {
        if (currentIndex >= stack.length) {
            throw new Exception("Nie można dodać więcej");
        }

        stack[currentIndex] = value;
        currentIndex++;

        return value;
    }

    public int getSize() {
        return -1;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(stack[i]);
            if (i < currentIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }

}
