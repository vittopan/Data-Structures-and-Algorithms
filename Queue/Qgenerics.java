import java.util.NoSuchElementException;

class Queue {
    private int size;
    private ListNode front;
    private ListNode rear;

    class ListNode {
        Integer data;
        ListNode next;

        ListNode(Integer data) {
            this.data = data;
        }
    }

    void enqueue(Integer e) {
        ListNode temp = new ListNode(e);
        if (size == 0) {
            front = temp;
        } else {
            rear = rear.next;
        }
        rear = temp;
        size++;

    }

    public Integer dequeue() {
        Integer result = front.data;
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
        return result;

    }

    public Integer examine() {
        return front.data;
    }

    public void show() {

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        Generics<Integer> num1 = new Generics<>(10);
        q.enqueue(num1.ob);
        q.show();
    }
}

class Generics<T> {
    T ob;

    Generics(T ob) {
        this.ob = ob;
    }
}
