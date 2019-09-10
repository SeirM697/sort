package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,2};
        SortTest sortTest = new SortTest();
////        sortTest.selectSort(arr);
////        sortTest.insertSort(arr);
////        sortTest.bubbleSort(arr);
//        sortTest.mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        ArrayList<Integer> list = new ArrayList<>();
        sortTest.quickSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
