package 学习计划.剑指Offer专项突击版.Day07_09_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/26 11:49
 * @Description:
 */

public class 剑指OfferII_022_链表中环的入口节点 {

    /**
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head, p = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                while (fast != p) {
                    fast = fast.next;
                    p = p.next;
                }
                return p;
            }
        }
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
