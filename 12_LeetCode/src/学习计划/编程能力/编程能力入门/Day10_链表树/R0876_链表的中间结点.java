package 学习计划.编程能力.编程能力入门.Day10_链表树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/2 21:36
 * @Description:
 */

public class R0876_链表的中间结点 {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
