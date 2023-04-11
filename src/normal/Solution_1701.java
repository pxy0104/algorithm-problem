package normal;

/**
 * 1701. 平均等待时间
 * 有一个餐厅，只有一位厨师。你有一个顾客数组customers，其中customers[i] = [arrivali, timei]：
 * <p>
 * arrivali是第i位顾客到达的时间，到达时间按 非递减 顺序排列。
 * timei是给第 i位顾客做菜需要的时间。
 * 当一位顾客到达时，他将他的订单给厨师，厨师一旦空闲的时候就开始做这位顾客的菜。每位顾客会一直等待到厨师完成他的订单。厨师同时只能做一个人的订单。厨师会严格按照 订单给他的顺序做菜。
 * <p>
 * 请你返回所有顾客需要等待的 平均时间。与标准答案误差在10-5范围以内，都视为正确结果。
 */
public class Solution_1701 {
    //    public double averageWaitingTime(int[][] customers) {
//        int start = 0;
//        int Len = customers.length;
//        double wait = 0;
//        for (int i = 0; i < Len; i++) {
//            int[] customer = customers[i];
//            int arrivali = customer[0];
//            int timei = customer[1];
//            start = Math.max(start, arrivali);
//            int finish = start + timei;
//            wait += finish - arrivali;
//            start = finish;
//        }
//        return wait / Len;
    public double averageWaitingTime(int[][] customers) {
        //Arrays.sort(customers, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        double wait = 0;
        int acc = 0;
        for (int[] customer : customers) {
            if (acc < customer[0])
                acc = customer[0];
            acc += customer[1];
            wait += acc - customer[0];
        }
        return wait / customers.length;
    }


    public static void main(String[] args) {
        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};
        Solution_1701 solution_1701 = new Solution_1701();
        double averageWaitingTime = solution_1701.averageWaitingTime(customers);
        System.out.println(averageWaitingTime);
    }
}
