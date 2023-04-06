package array;

/**
 * @author pxy
 * @software IntelliJ IDEA
 * @create 2023-04-06 20:26
 **/
//给定一个含有 n 个正整数的数组和一个正整数 s ，
// 找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。
// 如果不存在符合条件的子数组，返回 0。
public class MinSubArrayLen {
    //滑动窗口
    public static int exec(int[] nums, int s) {
        int len = 0;
//        Math.min();
        int maxValue = Integer.MAX_VALUE;  //获取最大值，用于比较获取最小值
        //3  1  2  10  4  1   ----6
        //确定起始位置和终止位置 用 i和j表示数组下标
        int left = 0;
        int sum = 0;
        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];
            while (sum > s) {
                len = Math.min(maxValue,right-left + 1);
                sum -= nums[left++];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        System.out.println(Math.min(1,4));
        int[] arr = new int[]{2,1,5,6,1,2};
        int len = MinSubArrayLen.exec(arr, 9);
        System.out.println(len);
    }
}
