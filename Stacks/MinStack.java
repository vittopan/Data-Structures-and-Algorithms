package Stacks;

import java.util.Stack;

class MinStack {
    Stack<Integer> stack;
    int minEle;
    int topEle;
    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        Stack<Integer> temp = new Stack<Integer>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        topEle = temp.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        stack.push(topEle);
        return topEle;
    }

    public int getMin() {
        Stack<Integer> a = new Stack<Integer>();
        while (!stack.isEmpty()) {
            a.push(stack.pop());
        }
        minEle = a.pop();
        while (!a.isEmpty()) {
            if (a.peek() > minEle) {
                minEle = a.pop();
            }
            stack.push(a.pop());
        }
        return minEle;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin(); // return -3
        minStack.pop();
        minStack.top(); // return 0
        minStack.getMin(); // return -2
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
