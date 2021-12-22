package 学习计划.数据结构入门.Day07_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 11:53
 * @Description:
 */

public class R0021_合并两个有序链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(-1);
        ListNode cur = ans;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;
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
