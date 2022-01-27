package 学习计划.剑指Offer专项突击版.Day07_09_链表;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/27 11:11
 * @Description:
 */

public class 剑指OfferII_024_反转链表 {

    public ListNode reverseList1(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
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
