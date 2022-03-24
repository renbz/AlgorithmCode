package 学习计划.数据结构.数据结构入门.Day07_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 12:32
 * @Description:
 */

public class R0203_移除链表元素 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode ans = new ListNode(-1);
        ListNode cur = ans;
        ans.next = head;

        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }
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
