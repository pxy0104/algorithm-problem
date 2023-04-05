package array;

/**
 * @author pxy
 * @software IntelliJ IDEA
 * @create 2023-04-05 17:37
 **/

public class RemoveVal {
    //给你一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，
    // 并返回移除后数组的新长度。
    //不要使用额外的数组空间，你必须仅使用 O(1)额外空间并原地修改输入数组。
    //元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
    //示例 1: 给定 nums = [3,2,2,3], val = 3, 函数应该返回新的长度 2,
    // 并且 nums 中的前两个元素均为 2。 你不需要考虑数组中超出新长度后面的元素。
    //思路：快慢指针法
    public static int remove(int nums[],int val){
        int lowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[lowIndex] = nums[fastIndex];
                lowIndex++;
            }
        }
        return lowIndex;
    }

    public static void main(String[] args) {
        int nums[] = new int[]{1,2,4,5};

//        int[] num = new int[4];
        int remove = RemoveVal.remove(nums, 2);
        System.out.println(remove);

    }
}
