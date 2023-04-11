package normal;

/*
 *面试题 05.02. 二进制数转字符串
 *二进制数转字符串。给定一个介于0和1之间的实数（如0.72），类型为double，打印它的二进制表达式。如果该数字无法精确地用32位以内的二进制表示，则打印“ERROR”。
 *
 */
public class Solution_05_02 {
    public String printBin(double num) {
        String res = "0.";
        while (res.length() < 32 && num !=0){
            num*=2;
            if ( num>=1){
                res = res +"1";
                num -= 1;
            }else if (num <1){
                res = res +"0";
            }
        }
        if(num!=0){
            return  "ERROR";
        }

        return res;
    }

    public static void main(String[] args) {
        Solution_05_02 solution0502 = new Solution_05_02();
        System.out.println(solution0502.printBin(0.15));
    }
}
