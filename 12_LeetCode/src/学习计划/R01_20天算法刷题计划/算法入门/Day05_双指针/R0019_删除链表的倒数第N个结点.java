package 学习计划.R01_20天算法刷题计划.算法入门.Day05_双指针;

/**
 * @author Ren
 */

public class R0019_删除链表的倒数第N个结点 {


    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(0, head);
            ListNode fast = head;
            ListNode slow = dummy;

            while (n-- > 0) fast = fast.next;

            while (fast != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }
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
