package list;


//题意：删除链表中等于给定值 val 的所有节点。
//示例 1： 输入：head = [1,2,6,3,4,5,6], val = 6 输出：[1,2,3,4,5]
//示例 2： 输入：head = [], val = 1 输出：[]
//示例 3： 输入：head = [7,7,7,7], val = 7 输出：[]
class ListNode {
    // 结点的值
    int val;

    // 下一个结点
    ListNode next;

    // 节点的构造函数(有一个参数)
    public ListNode(int val) {
        this.val = val;
    }
//    public void add(int val){
//        this.val = val;
//    }
    // 节点的构造函数(有两个参数)
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveElements {
    public static ListNode exec(ListNode head,int val){
        while (head != null && head.val==val) {
            head = head.next;
        }
        ListNode cur = head;
        while (cur !=null) {
            while (cur.next != null && cur.next.val == val) {
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(2,listNode2);
        ListNode listNode = new ListNode(1,listNode1);
        ListNode res = RemoveElements.exec(listNode, 2);
        System.out.println(res.next.val + res.val);
    }
}
