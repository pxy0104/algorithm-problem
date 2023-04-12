package list;


/**
 * 2023/4/12
 **/

public class SwapPairs {
    public static ListNode exec(ListNode head){
        ListNode dummyhead = new ListNode(-1); // 设置一个虚拟头结点
        dummyhead.next = head; // 将虚拟头结点指向head，这样方面后面做删除操作
        ListNode cur = dummyhead;
        ListNode temp; // 临时节点，保存两个节点后面的节点
        ListNode firstnode; // 临时节点，保存两个节点之中的第一个节点
        ListNode secondnode; // 临时节点，保存两个节点之中的第二个节点
        while (cur.next != null && cur.next.next != null) {
            temp = cur.next.next.next;
            firstnode = cur.next;
            secondnode = cur.next.next;
            cur.next = secondnode;       // 步骤一
            secondnode.next = firstnode; // 步骤二
            firstnode.next = temp;      // 步骤三
            cur = firstnode; // cur移动，准备下一轮交换
        }
        return dummyhead.next;
    }

    public static void main(String[] args){

        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(2,listNode2);
        ListNode listNode = new ListNode(1,listNode1);
        ListNode head = SwapPairs.exec(listNode);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }

    }
}
