package stack;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack);

        SubItem subItem = new SubItem(1, "a");
        stack.push(subItem);

        System.out.println(stack);


        stack.push(1);
        System.out.println(stack);

        stack.push(2);
        System.out.println(stack);

        stack.push("aa");
        System.out.println(stack);

        Object object = stack.pop();
        System.out.println(object);

        System.out.println(stack);

        object = stack.peek();
        System.out.println(object);

        System.out.println(stack);

        System.out.println(stack.search(1));
        System.out.println(stack.search(2));
        System.out.println(stack.search(3));
    }

}
