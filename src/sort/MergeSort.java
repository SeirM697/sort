package sort;

import static sort.SortUtil.*;

public class MergeSort {
    public static void mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);

    }

    private static void mergeSort(int[] nums, int left, int right) {
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(  nums,left,mid);
            mergeSort(  nums,mid+1,right);
            merge(nums,left,right);
        }
    }

    private static void merge(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        int i = left, j = mid + 1, k = left;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, left, temp, left, right - left + 1);
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                nums[k++] = temp[i++];
            } else {
                nums[k++] = temp[j++];
            }
        }
        while (i <= mid) {
            nums[k++] = temp[i++];
        }
        while (j <= right) {
            nums[k++] = temp[j++];
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 9, 2, 9, 6, 6, 5, 7, 0};
//        mergeSort(nums);
//        print(nums);
        for (int i = 0; i < 6; i++) {
            print(randomArrayGenerator(5,10,0));
        }
    }

}
