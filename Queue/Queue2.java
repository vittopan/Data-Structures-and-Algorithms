public class Queue2 {
    int[] arr = new int[5];
    int front = 0;
    int rear = 0;
    int size;
    public void enQueue(int e){
        if(!isFull()){
            arr[rear] = e;
            rear = (rear+1)%5;
            size++;
        }
    }
    public int deQueue(){
        int data = arr[front];
        if(!isEmpty()){
            front = (front+1)%5;
            size--;
        }else{
            System.out.println("Queue is empty");
        }
        return data;
    }
    public int getSize(){
        return size;
    }


    public boolean isEmpty(){
        if(getSize() == 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(getSize() == 5){
            return true;
        }
        return false;
    }
}

