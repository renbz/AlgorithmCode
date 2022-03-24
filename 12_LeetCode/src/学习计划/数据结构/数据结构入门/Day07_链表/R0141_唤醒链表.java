package 学习计划.数据结构.数据结构入门.Day07_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 11:40
 * @Description:
 */

public class R0141_唤醒链表 {

    public boolean hasCycle(ListNode head) {
        // 双指针判断链表是否有环
        if (head == null || head.next == null) return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
