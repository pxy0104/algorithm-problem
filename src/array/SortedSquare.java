package array;

import java.sql.Array;

/**
 * @author pxy
 * @software IntelliJ IDEA
 * @create 2023-04-06 20:03
 **/
//给你一个按 非递减顺序 排序的整数数组 nums，
// 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
public class SortedSquare {
    // -3 -2 0 2 4 6
    public static int[] exec(int[] nums){
        int length = nums.length;
        int[] result = new int[length];
        int i = 0;
        int j = length - 1;
       int  index = j ;
        while(i<=j){
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                result[index--] = nums[j] * nums[j];
                --j;
            } else{
                result[index--] = nums[i] * nums[i];
                ++i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2,-1,0,3,4,5};
        int[] arr = SortedSquare.exec(nums);
//        for (int i : arr) {
//            System.out.println(i+" ");
//        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        System.out.println(arr.toString());
    }
}
