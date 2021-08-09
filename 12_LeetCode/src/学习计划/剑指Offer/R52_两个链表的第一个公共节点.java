package 学习计划.剑指Offer;

/**
 * @author Ren
 */

public class R52_两个链表的第一个公共节点 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode newHeadA = headA, newHeadB = headB;
        while (newHeadA != newHeadB) {
            newHeadA = newHeadA == null ? headB : newHeadA.next;
            newHeadB = newHeadB == null ? headA : newHeadB.next;
        }
        return newHeadA;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
