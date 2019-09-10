import java.util.ArrayList;
import java.util.List;

public class Revers {
    public static boolean reverse(int x) {
        int temp = 0;
        long data = 0;
        int i = x;
        if(i<0){
            return false;
        }
        while (x != 0){
            temp = x%10;
            x = x/10 ;
            data =data*10 + temp;
        }
        if(data == i){
            return true;
        }
        return false;
    }
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0;i < nums.length;i++){
            if (target <= nums[i]){
                return i;
            }
        }
        return nums.length;
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0;i < nums.length;i++){
            int temp = target - nums[i];
            for(int j = i ;j < nums.length ;j++ ){
                if (nums[j] == temp && i!=j ){
                    return new int[]  {i,j};
                }
            }
        }
        return new int[]  {0,0};
    }
//    Definition for singly-linked list.

    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> arrayList = new ArrayList<>();
         List<Integer> result = new ArrayList<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i;j < nums.length;j++){
                for (int k = j; k < nums.length;k++){
                    if(nums[i] == -nums[k] - nums[j] && k!=j && j!=i){
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[k]);
                        arrayList.add(result);
                        continue;
                    }
                }
            }

        }
        return arrayList;

    }

    public static void main(String[] args) {
//        int x = 858;
//        reverse(x);
        int[] arr = {-1, 0, 1, 2, -1, -4};
//        x = searchInsert(arr,9);
////
//        for (Object i:threeSum(arr)
//             ) {
//            System.out.print(i+" ");
//        }
    }
}
