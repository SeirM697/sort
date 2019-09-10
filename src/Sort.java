
public class Sort {
    public static void main(String[] args) {
        int[] arr = {2,1};
//        int[] newarr = sort(arr,0,7);
//        for (int i :newarr) {
//                   System.out.print(i+" ");
//             }
//               bubblerSort(arr);
//        removeArr(arr);
//               insertSoprt(arr);
//        rotate(arr,3);
//       int[] arr1 = sortArrayByParityII(arr);
        quickSort(arr);
        System.out.println(arr[arr.length - 2]);
    }

    public static void bubblerSort(int arr[]) {
        int n = arr.length;
        if (n <= 1) {
            return;
        } else {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }
        }
    }


    public static void insertSort(int arr[]) {
        /**  for (int i = 0;i < n;i++){
         //
         for (int j = i;j > 0; j--){
         //若后一个元素比前一个元素小则交换位置
         if (arr[j] < arr[j-1]){
         int temp = arr[j];
         arr[j] = arr[j-1];
         arr[j-1] = temp;
         }else {
         //若后一个元素比前一个元素大，则停止本次循环，找下一个元素
         break;
         }
         }
         }*/
        if (arr.length <= 1) {
            return;
        } else {
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int value = arr[i];
                int j = i - 1;
                // 从后向前找该元素的插⼊位置
                for (; j >= 0; j--) {
                    if (arr[j] > value) {
                        arr[j + 1] = arr[j];
                    } else {
                        break;
                    }
                }
                arr[j + 1] = value;
            }

        }
    }

    public static int removeArr(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int[] sortArrayByParity(int[] A) {
        int l = 0;
        int r = A.length - 1;
        int arr[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[l++] = A[i];
            } else {
                arr[r--] = A[i];
            }
        }
        return arr;
    }

    public static void binaryInster(int[] arr, int a) {
        //二分查找
        int low = 0;
        int hight = arr.length - 1;
        int mid = 0;
        while (low <= hight) {
            mid = (hight - low) / 2 + low;
            if (arr[mid] < a) {
                low = mid + 1;
            } else {
                hight = mid + 1;
            }
        }
        return;
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            //找到最小值
            for (int j = index + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        int mid = n / 2;
        mergeInternal(arr, 0, n - 1);
    }

    private static void mergeInternal(int[] arr, int low, int hig) {
        int mid = (low + hig) / 2;
        if (low >= hig) {
            return;
        } else {
            //左边
            mergeInternal(arr, low, mid);
            //右边
            mergeInternal(arr, mid + 1, hig);
            //合并；
            merge(arr, low, mid, hig);
        }

    }

    private static void merge(int[] arr, int low, int mid, int hig) {
        int i = low;
        int j = mid + 1;
        //
        int[] temp = new int[hig - low + 1];
        int k = 0;
        //  先把较小的数移到新数组
        //“=”为了保持稳定性
        while (i <= mid && j <= hig) {
            //比较两个数组的数找出最小值
            if (arr[i] <= arr[j]) {
                //左边小放左边
                //此时i先用在自增
                temp[k++] = arr[i++];
            } else {
                //又变小放右边
                temp[k++] = arr[j++];
            }
        }
        //把左边剩余的数组放到新数组，小于的时候说明还没有放完
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //把右边剩余的数组放到新数组，同上
        while (j <= hig) {
            temp[k++] = arr[j++];
        }
        //把新数组中的值覆盖到源数组当中
        for (int x = 0; x < temp.length; x++) {
            //low没有发生改变，从low开始往上递增
            arr[x + low] = temp[x];
        }
    }

    public static void ShellSort(int[] arr) {
        int n = arr.length;
        //希尔增量排序
        for (int d = n / 2; d > 0; d /= 2) {
            //插入排序
            //
            for (int i = d; i < n; i++) {
                int temp = arr[i];
                for (int j = i; j >= d && arr[j - d] > temp; j--) {
                    arr[j] = arr[j - d];
                    arr[j - d] = temp;
                }
            }
        }

    }

    public static void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = nums.length - 1; j > 0; j--) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }

    public static int[] sortArrayByParityII(int[] A) {
        int l = 0, r = 1;

        while (l < A.length && r < A.length) {
            if (A[l] % 2 == 1 && A[r] % 2 == 0) {
                swap(A, l, r);
                l += 2;
                r += 2;
            } else if (A[l] % 2 == 0) {
                l += 2;
            } else {
                r += 2;
            }
        }

        return A;
    }

    private static void swap(int[] array, int x, int y)
    {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    public static void quickSort(int[] arr){
        int n = arr.length;
        if (n == 0){
            return;
        }
        quickSortInternal(arr,0,n-1);
    }
    // 分治
    private static void quickSortInternal(int[] arr,int l,int r){
        //递归函数出口
        if ( l >= r){
            return;
        }
        //取得区间点
        int k = partition2(arr,l,r);
        //区间点以前的元素
        quickSortInternal(arr,l,k-1);
        //区间点以后的元素
        quickSortInternal(arr,k+1,r);
    }
//    选取分区钱
    private static int partition(int[] arr,int l,int r){
        //选取基准值为第一个元素
        int v = arr[l];
        //arr[l+1...j]<v;
        //定义比val小的区域的最后一个元素
        int j = l;
        //arr[j+1...i]>v 定义比val大的元素的最后一个元素
        int i = l+1;
        for(;i<= r;i++){
            if(arr[i] < v){
                //若比区间点小则放在比区间小的区域的最后一个元素的后一个元素上
                swap(arr, j+1, i);
                j++;
            }
        }
        //若比区间点大则放在区间点大的区域的元素的后面，交换l与j的元素
        swap(arr,l,j);

        return j;
    }
    //(int)(1+Math.random()*(10-1+1))
    private static int partition2(int[] arr,int l,int r){
        //选取基准值
        int index = (int)(Math.random()*(r-l+1)+1);
        swap(arr,l,index);
        int v = arr[l];
        //定义一个比基准值小的区域的最后一个元素，第一次区域为空
        int i = l+1;
        //定义比基准值大的区域的第一个元素，第一次区域为空
        int j = r;
        while (true){
            //让指针i向后移动，保证比v的小区域扩大，当遇到arr[i]>v时停下
            while(i <= r  && arr[i] < v)i++;
            //让指针j向前移动，保证比v的大区域扩大，当遇到arr[j]<v时停下
            while(j >= l+1 && arr[j] > v)j--;
            //若此时i>j说明数组里的元素全部走了一遍，循环结束
            if (i > j){
                break;
            }
            //此时情况为：arr[i]>v  arr[j]<v 循环停止  这是交换两个指针继续往后走 循环继续
            swap(arr,i,j);
            i++;
            j--;
        }
        //循环走完后J指针为分区点位置
        swap(arr,l,j);
        return j;
    }
    }






