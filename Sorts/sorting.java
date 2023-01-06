package Sorts;
/*
 * Learning that mergeSort is two seperate sub routines.
 * Both "Merge" and "Merge Sort"
 */

import java.util.Arrays;

public class sorting {
    static int[] merge(int[] left, int[] right) {
        int[] nums = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int i = 0;
        while (l < left.length && r < right.length) {
            if (left[l] < right[r]) {
                nums[i] = left[l];
                l++;
            } else {
                nums[i] = right[r];
                r++;
            }
            i++;
        }
        while (l < left.length) {
            nums[i] = left[l];
            l++;
            i++;
        }
        while (r < right.length) {
            nums[i] = right[r];
            r++;
            i++;
        }
        return nums;
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int mid = nums.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));
        return merge(left, right);
    }

    public static void main(String[] args) {
        int[] nums = { 5, 8, 1, 2, 3, 90, 31, 41, 21, 19, 3, 8 };
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));

    }

}
