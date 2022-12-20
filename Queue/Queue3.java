
import java.util.NoSuchElementException;
/*
 * This program shows a linked list implementation.
 */
public class Queue3 {
    private ListNode front;
    private ListNode rear ;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void enQueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }else{
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public int deQueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear = null;
        }
        length--;
        return result;
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length() == 0;
    }
    public int peek(){
        return front.data;
    }

    public static void main(String[] args){
        Queue3 a = new Queue3();
        a.enQueue(10);
        a.enQueue(12);
        a.enQueue(17);
        a.peek();
    }
}
