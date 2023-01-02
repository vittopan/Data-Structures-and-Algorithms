package Stacks;

import java.util.Stack;

public class MyStack {
    private Stack<Integer> stack;

    public MyStack() {
        stack = new Stack<Integer>();
    }

    public void add(int data) {
        stack.push(data);
    }

    public void sort() {
        Stack<Integer> s = new Stack<Integer>();
        s.push(stack.pop());
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!s.isEmpty() && s.peek() > temp) {
                stack.push(s.pop());
            }
            s.push(temp);
        }
        while (!s.isEmpty()) {
            stack.push(s.pop());
        }
    }

    public void show() {
        for (int i : stack) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyStack a = new MyStack();
        a.add(10);
        a.add(9);
        a.add(39);
        a.add(32);
        a.add(2);
        a.add(19);
        a.sort();
        a.show();
    }

}
