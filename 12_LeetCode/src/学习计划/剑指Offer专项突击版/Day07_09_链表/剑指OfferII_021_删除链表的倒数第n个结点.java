package 学习计划.剑指Offer专项突击版.Day07_09_链表;

import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/25 21:08
 * @Description:
 */

public class 剑指OfferII_021_删除链表的倒数第n个结点 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode fast = pre, slow = pre;
        //快指针先走n-1步
        while (n-- > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow.next.next != null) {
            slow.next = slow.next.next;
        } else {
            slow.next = null;
        }
        return pre.next;
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
