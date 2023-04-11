package simple;

import java.util.ArrayList;
import java.util.List;

/*
 *面试题 08.06. 汉诺塔问题
 *在经典汉诺塔问题中，有 3 根柱子及 N 个不同大小的穿孔圆盘，盘子可以滑入任意一根柱子。一开始，所有盘子自上而下按升序依次套在第一根柱子上(即每一个盘子只能放在更大的盘子上面)。移动圆盘时受到以下限制:
 * (1) 每次只能移动一个盘子;
 * (2) 盘子只能从柱子顶端滑出移到下一根柱子;
 * (3) 盘子只能叠在比它大的盘子上。
 */
public class Solution_08_06 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<Integer> A = new ArrayList();
        List<Integer> B = new ArrayList();
        List<Integer> C = new ArrayList();
        A.add(4);
        A.add(2);
        A.add(1);
        System.out.println(A.get(0));
        System.out.println(A.get(1));
        solution.hanota(A,B,C);
        System.out.println("*****");
//        C.forEach();
        System.out.println(C.size());
        for (int b :
                B) {
            System.out.println(b);
        }
    }
}
class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        hanoiTower(A.size(),A,B,C);
    }
    public void hanoiTower(int size,List<Integer> A, List<Integer> B, List<Integer> C){
        if (size == 1){
            Integer integer = A.get(A.size()-1);
            B.add(integer);
            A.remove(A.size() - 1);
            return;
        }else {
            hanoiTower(size-1,A,C,B);
            Integer integer = A.get(A.size() - 1);
            B.add(integer);
            A.remove(A.size() - 1);
            hanoiTower(size-1,C,B,A);
        }


    }
}
