package 学习计划.剑指Offer专项突击版.Day25_26_排序;

import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/14 09:27
 * @Description:
 */

public class 剑指OfferII_077_链表排序 {

    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
        while (head != null) {
            minHeap.offer(head);
            head = head.next;
        }
        ListNode ans = new ListNode(), cur = ans;
        while (minHeap.size() > 0) {
            cur.next = minHeap.peek();
            minHeap.poll();
            cur = cur.next;
        }
        cur.next = null;
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
