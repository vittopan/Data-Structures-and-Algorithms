
import java.util.NoSuchElementException;

public class Queue {
    int[] nums = new int[5];
    int first = 0;
    int last = 0;
    int size = 0;

    public void enQueue(int data) {
        nums[last] = data;
        last = (last + 1) % nums.length;
        size++;
    }

    public int deQueue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int result = nums[first];
        first = (first + 1) % nums.length;
        size--;
        return result;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == 5;
    }

    public int examine() {
        return nums[first];
    }

    public int getSize() {
        return nums.length;
    }

    public void show() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        Queue a = new Queue();
        a.enQueue(5);
        a.enQueue(3);
        a.enQueue(2);
        a.enQueue(9);
        a.enQueue(1);
        a.show();

    }
}
