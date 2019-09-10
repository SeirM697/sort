package sort;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class SortUtil {

    public static void swap(int[] array, int idx, int idy) {
        int swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
    }

    public static void print(int[] nums) {
        for (int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**
     * 生成一个随机的数组方便测试排序效果
     *
     * @param length    数组长度
     * @param upBound   每个元素的最大上界
     * @param downBound 每个元素的最小下界
     * @return 生成的数组
     */
    public static int[] randomArrayGenerator(int length, int upBound, int downBound) {
        int[] res = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            res[i] = rand.nextInt(upBound - downBound + 1) + downBound;
        }
        return res;
    }
}