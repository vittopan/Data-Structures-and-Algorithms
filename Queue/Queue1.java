/*
 * This is a simple program in my introduction to Queue's
 * In this program i learn how to make a basic
 * array of size 5, how to perform basic commands such
 * as enQueue() and deQueue().
 */
package Queue;

public class Queue1{
    int[] queue = new int[5];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        if(!isFull()){
            queue[rear] = data;
            rear = (rear + 1)%5;
            size++;
        }else{
            System.out.println("Queue is Full");        
        }
    }
    public void show(){
        for(int i = 0;i<size;i++){
            System.out.println(queue[(front + i)%5] + " ");
        }
    }
    public int deQueue(){
        int data = queue[front];
        if(!isEmpty()){
            front = (front+1)%5;
            size--;
        }else{
            System.out.println("Queue is Empty");
        }
        
        return data;
    }
    public boolean isEmpty(){
        return getSize() == 0;
    }
    public int getSize(){
        return size;
    }
    public boolean isFull(){
        return getSize() == 5;
    }



}