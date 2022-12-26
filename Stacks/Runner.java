package Stacks;

public class Runner {
    public static void main(String[] args) {
        MyStack nums = new MyStack();
        nums.push(5);
        nums.push(10);
        nums.push(20);
        nums.push(3);
        nums.push(34);
        System.out.println(nums.pop());
    }
}
