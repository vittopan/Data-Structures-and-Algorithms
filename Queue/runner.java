package Queue;



public class runner {
    public static void main(String[] args){
        Queue1 q = new Queue1();
        q.enQueue(1);
        q.enQueue(3);
        q.enQueue(6);
        q.enQueue(8);
        q.enQueue(7);
        q.enQueue(9);
        q.deQueue();
        q.enQueue(9);
        q.show();
    }   
}
 