package 学习计划.数据结构基础.Day13_链表;

/**
 * @author Ren
 */

public class R0025_K个一组翻转链表 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy, end = dummy;
        while (end.next != null){
            for (int i = 0; i < k && end != null; i++) end = end.next;
            if (end == null) break;

            ListNode start = pre.next;
            ListNode next = end.next;

            end.next=null;
            pre.next = reverseList(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;

    }


    /**
     * 链表反转
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
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
