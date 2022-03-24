package 学习计划.算法.算法入门.Day10_递归_回溯;

/**
 * @author Ren
 */

public class R01_0021_合并两个有序链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newNode = new ListNode(1), newHead = newNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                newNode.next = l1;
                l1 = l1.next;
                newNode = newNode.next;
            } else {
                newNode.next = l2;
                l2 = l2.next;
                newNode = newNode.next;
            }
        }
        if (l1 != null && l2 == null) {
            newNode.next = l1;
        } else {
            newNode.next = l2;
        }
        return newHead.next;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}



