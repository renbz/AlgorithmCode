package 学习计划.数据结构入门.Day08_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 12:46
 * @Description:
 */

public class R0206_反转链表 {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
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
    //递归版本
    public ListNode reverseList2(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
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
