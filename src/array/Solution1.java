package array;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 *
 * @author pxy
 * @software IntelliJ IDEA
 * @create 2023-04-05 17:10
 **/

public class Solution1 {

    //给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target,写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。

    //数组为有序且无重复

    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) { //判断
            int middle = (left+right)/2;
            if(nums[middle] < target){
                left = middle;
            } else if (nums[middle] > target) {
                right = middle;
            }else {
                return middle;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,6,8,9,14,19,20};
        int index = new Solution1().search(nums, 14);
        System.out.println(nums[index]);
//        System.out.println();
    }
}
