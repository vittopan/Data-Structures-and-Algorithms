package Stacks;

import java.util.NoSuchElementException;

public class Stack1 {
    int[] stack = new int[5];
    int top = 0;

    public void push(int data) {
        stack[top] = data;
        top++;
    }

    public int pop() {
        top--;
        int result = stack[top];
        stack[top] = 0;
        return result;
    }

    public int peek() {

        return 0;
    }

    public int getSize() {
        int length = 0;
        for (int i : stack) {
            if (i != 0) {
                length += 1;
            }
        }
        return length;
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i);
        }
    }
}
