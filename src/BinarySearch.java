public class BinarySearch {
    public static int binarySearch(int[] arr, int key, int low, int hight) {
        if (key < arr[low] || key > arr[hight] || low > hight) {
            return -1;
        }
        int mid = (hight - low) / 2;
        if (key < arr[mid]){
            binarySearch(arr,key,low,mid);
        }else if (key > arr[mid]){
            binarySearch(arr,key,mid,hight);
        }
        return arr[mid];
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3};
    }
}
