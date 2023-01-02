package Stacks;

import java.util.LinkedList;
import java.util.Queue;

/* Implement a stack using a queue. */
class StackQueue {
    private Queue<Integer> queue;

    public StackQueue() {
        queue = new LinkedList<Integer>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public void pop() {
        Queue<Integer> temp = new LinkedList<Integer>();
        int counter = 0;
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
            counter++;
        }
        while (counter > 1) {
            queue.add(temp.poll());
            counter--;
        }
    }

    public int top() {
        Queue<Integer> temp = new LinkedList<Integer>();
        int counter = 0;
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
            counter++;
        }
        while (counter > 1) {
            queue.add(temp.poll());
            counter--;
        }
        int topInteger = temp.poll();
        queue.add(topInteger);
        return topInteger;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
