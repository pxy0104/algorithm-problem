package simple;

import java.util.Arrays;

/**
 * 1700. 无法吃午餐的学生数量
 * 学校的自助午餐提供圆形和方形的三明治，分别用数字0和1表示。所有学生站在一个队列里，每个学生要么喜欢圆形的要么喜欢方形的。
 * 餐厅里三明治的数量与学生的数量相同。所有三明治都放在一个栈里，每一轮：
 *
 * 如果队列最前面的学生喜欢栈顶的三明治，那么会拿走它并离开队列。
 * 否则，这名学生会放弃这个三明治并回到队列的尾部。
 * 这个过程会一直持续到队列里所有学生都不喜欢栈顶的三明治为止。
 *
 */
public class Solution_1700 {
    int countStudents(int[] students, int[] sandwiches) {
        int s1 = Arrays.stream(sandwiches).sum();
        int s0 = sandwiches.length - s1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0 && s0 > 0) {
                s0--;
            } else if (students[i] == 1 && s1 > 0) {
                s1--;
            } else {
                break;
            }
        }
        return s0 + s1;
    }
    public static void main(String[] args) {
        int[] students = {1, 0, 1, 1};
        int[] sandwiches = {0, 0, 1, 0};
        Solution_1700 solution = new Solution_1700();
        int stu = solution.countStudents(students, sandwiches);
        System.out.println(stu);
    }
}
