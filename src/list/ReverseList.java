package list;


/**
 * 这是一道反转链表的题目，我们需要做的是把一个链表反转
 * 1->2->3->4->5  ----->  5->4->3->2->1
 * 我们需要定义个prev节点,临时节点temp,还有一个当前移动用的节点cur
 * 第一步，先使用temp节点提前标记第二个节点，以防第一个节点指针指向prev节点时丢失
 * 第二步，开始变换指针，我们把cur的指针指向prev，prev即null
 * 第三步，把cur赋值给prev：prev向前移动一个节点
 * 第四步：把标记节点temp赋值给cur：cur也向前移动一个节点:
 * 到此为止，temp和cur同处原链表第二节点处，prev处在第一节点处，而第一节点指向第二节点的指针指向了prev的初始值null；
 * 判断条件为cur != null，当循环结束时，temp和cur节点会处于prev最开始的位置，即null节点，此时循环停止，prev也变为反转链表的首节点
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
        head = ReverseList.exec(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
