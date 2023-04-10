package list;


/**
 * 2023/4/10
 **/

public class ReverseList {

    public static ListNode exec(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode listNode2 = new ListNode(3);
        ListNode listNode1 = new ListNode(2, listNode2);
        ListNode listNode = new ListNode(1, listNode1);
        ListNode head = ReverseList.exec(listNode);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }


    }
}
