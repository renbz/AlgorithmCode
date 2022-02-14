package 学习计划.剑指Offer专项突击版.Day25_26_排序;

import java.util.ArrayList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/14 09:46
 * @Description:
 */

public class 剑指OfferII_078_合并排序链表 {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];
        if (lists.length == 2) return mergeTwo(lists[0], lists[1]);
        ListNode[] newList = new ListNode[(lists.length + 1) / 2];
        for (int i = 0; i < lists.length / 2; i++) {
            newList[i] = mergeTwo(lists[i], lists[lists.length - 1 - i]);
        }
        if (lists.length / 2 != newList.length) {
            newList[newList.length - 1] = lists[newList.length - 1];
        }
        return mergeKLists(newList);
    }

    // mergeTwoListNode
    public ListNode mergeTwo(ListNode head1, ListNode head2) {
        ListNode ans = new ListNode(0), cur = ans;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        if (head1 != null) cur.next = head1;
        if (head2 != null) cur.next = head2;
        return ans.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
