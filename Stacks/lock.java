package Stacks;

import java.util.NoSuchElementException;

/*
 * a. write a (non-cyclic) block implementation of the deque ADT
 * methods:
 * 1. DequeCharCyclic(s):
 * 2. isEmpty()
 * 3. isFull()
 * 4. pushLeft()
 * 5. pushRight() throws overFlow
 * 6. peekLeft()
 * 7. peekRight()
 * 8.popLeft()
 * 9.popRight() throws Underflow
*/
//? Question 2 a and 2 b -- Deque with cyclic implementation.
interface lock {
    boolean isEmpty();

    boolean isFull();

    void pushLeft(int c);

    void pushRight(int c);

    void peekLeft();

    void peekRight();

    int popLeft();

    int popRight();

    void show();
}

class DequeCharCyclic implements lock {
    int[] Deque; // the Deque
    int size = 0; // current size of the Deque
    int rear; // rear index
    int front; // front index
    int length; // length of the array (entered by user)

    public DequeCharCyclic(int length) {
        int[] Deque = new int[length];
        this.Deque = Deque;
        this.length = length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == length;
    }

    public void pushLeft(int c) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            Deque[front] = c;
            front = (front - 1) % length;
            if (front == -1) {
                front = length - 1;
            }
            size++;

        }

    }

    public void pushRight(int c) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            rear = (rear + 1) % length;
            if (rear == length) {
                rear = 0;
            }
            Deque[rear] = c;
            size++;
        }

    }

    public void peekLeft() {
        System.out.println(Deque[front + 1]);
    }

    public void peekRight() {
        System.out.println(Deque[rear]);

    }

    public int popLeft() throws NoSuchElementException {
        int result = Deque[front];
        if (isEmpty()) {
            throw new NoSuchElementException("UnderFlow");
        } else {
            Deque[front] = 0;
            front = (front + 1) % length;
            if (front == length) {
                front = 0;
            }
        }
        size--;
        return result;
    }

    public int popRight() throws NoSuchElementException {
        int result = Deque[rear];
        if (isEmpty()) {
            throw new NoSuchElementException("UnderFlow");
        } else {
            Deque[rear] = 0;
            rear = (rear - 1) % length;
            if (rear == -1) {
                rear = length - 1;
            }
        }

        size--;
        return result;
    }

    public void show() {
        for (int i = 0; i < length; i++) {
            System.out.println(Deque[i]);
        }
    }

    public static void main(String[] args) {
        lock l;
        DequeCharCyclic Deque = new DequeCharCyclic(6);
        l = Deque;
        l.pushLeft(5);
        l.pushLeft(10);
        l.pushRight(3);
        l.pushRight(43);
        l.pushLeft(4);
        l.pushRight(69);
        l.popRight();
        l.show();
        System.out.println(" ");
        l.peekRight();
        l.peekLeft();

    }
}
