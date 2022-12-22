package Sorts;

public class sort2 {
    public static void mergeSort(int[] nums){
        int len = nums.length;
        if(len < 2){
            return;
        }
        int midIndex = len/2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[len - midIndex];
        for(int i = 0; i<midIndex;i++){
            leftHalf[i] = nums[i];
        }
        for(int i = midIndex; i < len; i++){
            rightHalf[i-midIndex] = nums[i-midIndex];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(nums, leftHalf, rightHalf);
    }
    private static void merge(int[] nums, int[] leftHalf, int[] rightHalf){
            
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;
        while(i < leftSize && j < rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                nums[k] = leftHalf[i];
                i++;
            }else{
                nums[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i < leftSize){
            nums[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j < rightSize){
            nums[k] = rightHalf[j];
            j++;
            k++;

        }

    }
    public static void main(String[] args){
        int[] nums = new int[]
    }
    
    
    
}


