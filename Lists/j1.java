package Lists;

import java.util.NoSuchElementException;

public class j1 {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enQueue(1);
        q.enQueue(10);
        q.enQueue(15);
        q.enQueue(19);
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private int length;
    private Node front;
    private Node rear;

    public void enQueue(int e) {
        Node temp = new Node(e);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int deQueue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        length--;

        return result;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int front() {

        return front.data;
    }

    public int size() {
        return length;
    }

}

class Stack {

}
