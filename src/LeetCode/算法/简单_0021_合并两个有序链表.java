package LeetCode.算法;

/**
 * @Author longtao
 * @Date 2020/4/23
 * @Describe 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 **/
public class 简单_0021_合并两个有序链表 {
    /**
     * @Author longtao
     * @Date 2020/4/23
     * @Describe main方法
     **/
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(2);

        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(9);

        //调用方法
        ListNode node = mergeTwoLists(node1,node2);
        while(node != null){
            System.out.println("node.val:"+node.val);
            node = node.next;
        }

    }

    /**
     * @Author longtao
     * @Date   2020/4/23
     * @Describe  递归法
     **/
        public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            else if (l2 == null) {
                return l1;
            }
            else if (l1.val < l2.val) {
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else {
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }

        }


    /**
     * @Author longtao
     * @Date 2020/4/23
     * @Describe 实现ListNode排序
     **/
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}

