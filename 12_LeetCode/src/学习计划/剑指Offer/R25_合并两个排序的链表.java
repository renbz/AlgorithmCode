package 学习计划.剑指Offer;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

/**
 * @author Ren
 */

public class R25_合并两个排序的链表 {

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

        ListNode(int x) {
            val = x;
        }
    }
}
