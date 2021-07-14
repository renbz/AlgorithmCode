package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R22_链表中倒数第k个节点 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //双指针，一个快，一个慢,快的比慢的快k-1个节点,快的到达尾节点时，慢的到达倒数第k个节点
        ListNode l = head,r=head;
        for (int i = 0; i < k - 1; i++)  r = r.next;
        while (r.next != null) {
            l = l.next;
            r = r.next;
        }
        return l;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
