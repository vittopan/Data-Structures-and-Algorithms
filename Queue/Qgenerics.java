import java.util.NoSuchElementException;

/* 
 * This Queue implementation was created with generics.
 */
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
        Generics<Integer> num2 = new Generics<>(2);
        Generics<Integer> num3 = new Generics<>(4);
        Generics<Integer> num4 = new Generics<>(19);
        Generics<Integer> num5 = new Generics<>(1);
        Generics<Integer> num6 = new Generics<>(8);
        Generics<Integer> num7 = new Generics<>(9);
        q.enqueue(num1.ob);
        q.enqueue(num2.ob);
        q.enqueue(num3.ob);
        q.enqueue(num4.ob);
        q.enqueue(num5.ob);
        q.enqueue(num6.ob);
        q.enqueue(num7.ob);
    }
}

class Generics<T> {
    T ob;

    Generics(T ob) {
        this.ob = ob;
    }
}
