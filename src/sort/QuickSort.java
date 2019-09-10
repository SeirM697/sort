package sort;

import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.Random;

import static sort.SortUtil.*;

public class QuickSort {
    public static void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public static void quickSort(int[] nums, int start, int end) {
        if (start < end) {
            int p = partition1(nums, start, end);
            quickSort(nums, start, p - 1);
            quickSort(nums, p + 1, end);
        }
    }


    public static int partition1(int[] nums, int start, int end) {
        int val = nums[start];
        int i = start;
        int j = i + 1;
        for (; j <= end; j++){
            if (nums[j]<val){
                swap(nums,i+1,j);
                i++;
            }
        }
        swap(nums,start,i);
        return i;

    }

    public static int partition(int[] nums, int start, int end) {
        int pivot = nums[end];
        int slow = 0;
        for (int fast = 0; fast < end; fast++) {
            if (nums[fast] <= nums[end]) {
                swap(nums, fast, slow++);
            }
        }
        swap(nums, slow, end);
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 8, 9, 2, 9, 6, 6, 5, 7, 0};
        quickSort(nums);
        print(nums);
    }

}
