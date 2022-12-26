package Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void sorts(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            int currentVal = nums[i];
            int freePosition = i - 1;
            while (freePosition >= 0 && nums[freePosition] > currentVal) {
                nums[freePosition + 1] = nums[freePosition];
                freePosition--;
            }
            nums[freePosition + 1] = currentVal;
        }
    }

    public static void main(String[] args) {
        int[] n = { 1, 5, 9, 5, 3, 7, 69, 43, 2, 10 };
        System.out.println("Before:" + Arrays.toString(n));
        sorts(n);
        System.out.println("After:" + Arrays.toString(n));
    }
}
