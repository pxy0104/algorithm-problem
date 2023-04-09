package list;

/**
 * 2023/4/8
 **/
/*
在链表类中实现这些功能：

get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。
addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。

 */
public class MyLinkedList {
    //size存储链表元素的个数
    int size;
    //虚拟头结点
    ListNode head;

    //初始化链表
    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }


    //获取第index个节点的数值，注意index是从0开始的，第0个节点就是头结点
    public int get(int index) {
        //如果index非法，返回-1
        if (index < 0 || index>=size) {
            return -1;
        }
        ListNode currentNode = head;
        //包含一个虚拟头节点，所以查找第 index+1 个节点
        for (int i = 0; i <=index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }
    //在链表最前面插入一个节点，等价于在第0个元素前添加
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    //在链表的最后插入一个节点，等价于在(末尾+1)个元素前添加
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    // 在第 index 个节点之前插入一个新节点，例如index为0，那么新插入的节点为链表的新头节点。
    // 如果 index 等于链表的长度，则说明是新插入的节点为链表的尾结点
    // 如果 index 大于链表的长度，则返回空
    public String addAtIndex(int index, int val) {
        if (index > size) {
            return "Out of index.";
        }
        if (index < 0) {
            index = 0;
        }
        size++;
        //找到要插入节点的前驱
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
        return "添加成功";
    }

    //删除第index个节点
    public void deleteAtIndex(int index) {
        //判断index是否越界
        if (index < 0 || index >=size) {
            return;
        }
        //index合法，链表长度-1
        size--;
        //判断index是否是首结点
        if (index == 0) {
            head = head.next;
            return;
        }
        ListNode pred = head;
        //如果不是首结点，则正常删除
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }

    public static void main(String[] args) {


        MyLinkedList myLinkedList = new MyLinkedList();
        System.out.println(myLinkedList.head.val);
        myLinkedList.addAtIndex(0,21);
//        myLinkedList.addAtHead(1);
//        myLinkedList.addAtHead(2);
        myLinkedList.addAtTail(9);
//        System.out.println(myLinkedList.get(0));

        System.out.println(myLinkedList.addAtIndex(2,2));
        myLinkedList.addAtIndex(3,3);
//        myLinkedList.addAtTail(4);
        myLinkedList.deleteAtIndex(1);
        for (int i = 0; i < myLinkedList.size; i++) {
            System.out.println(myLinkedList.get(i));

        }

    }
}
