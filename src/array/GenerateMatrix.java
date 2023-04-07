package array;


//给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，
// 且元素按顺时针顺序螺旋排列的正方形矩阵。
public class GenerateMatrix {
    public static int[][] exec(int n){
        int loop = 0;  // 控制循环次数
        int[][] res = new int[n][n];
        int start = 0;  // 每次循环的开始点(start, start)
        int count = 1;  // 定义填充数字
        int i, j;

        while (loop++ < n / 2) { // 判断边界后，loop从1开始
            // 模拟上侧从左到右
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            // 模拟下侧从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            // 模拟左侧从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }

        return res;

    }
    public static void main(String[] args) {
        int[][] nums = GenerateMatrix.exec(12);
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                System.out.printf("%d\t",nums[i][j]);
            }
            System.out.println();
        }
    }
}
