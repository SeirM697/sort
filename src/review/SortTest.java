package review;

import java.util.Arrays;

public class SortTest {
    public void swap(int[] arr, int a, int b) {
        int data = arr[a];
        arr[a] = arr[b];
        arr[b] = data;
    }

    //选择排序
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = i;
            for (int j = i + 1; j < arr.length; j++) {
                //找到最小值
                if (arr[temp] > arr[j]) {
                    temp = j;
                }
            }
            swap(arr, temp, i);
        }
    }

    //插入排序
    public void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int data = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > data) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            //把改变了的值换回来
            arr[j + 1] = data;
        }
    }

    //冒泡排序
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //设置标志位 若为true说明没有要排序的元素
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    swap(arr, j, j + 1);
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    //归并排序
    public void mergeSort(int[] arr) {
        int p = 0;
        int r = arr.length - 1;
        mergeSortRec(arr, p, r);
    }

    private void mergeSortRec(int[] arr, int p, int r) {
        if (p >= r) return;
        int mid = (p + r) / 2;
        mergeSortRec(arr, p, mid);
        mergeSortRec(arr, mid + 1, r);
        mergeSortMethod(arr, p, mid, r);
    }

    private synchronized void mergeSortMethod(int[] arr, int p, int mid, int r) {
        int i = p;
        int j = mid + 1;
        int[] arr1 = new int[r - p + 1];
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                arr1[k++] = arr[i++];
            } else {
                arr1[k++] = arr[j++];
            }
        }
        int s = i;
        int e = mid;
        if (j <= r) {
            s = j;
            e = r;
        }
        while (s <= e) {
            arr1[k++] = arr[s++];
        }
        for (i = 0; i <= r - p; i++) {
            //把已排序好的放回源数组
            arr[p + i] = arr1[i];
        }
    }


    //快速排序
    public void quickSort(int[] arr) {
        if (arr.length == 1) return;
        int n = arr.length - 1;
        quickSort(arr, 0, n);
    }

    private void quickSort(int[] arr, int l, int n) {
        if (l >= n) return;
        int k = quickData(arr, l, n);
        quickSort(arr, l, k);
        quickSort(arr, k + 1, n);
    }

    private int quickData(int[] arr, int l, int n) {
        int k = arr[l];
        int i = l;
        int j = l + 1;
        for (;j<=n;j++){
            if (arr[j]<k){
                swap(arr,i+1,j);
                i++;
            }
        }
        swap(arr,l,i);
        return i;
    }
}
