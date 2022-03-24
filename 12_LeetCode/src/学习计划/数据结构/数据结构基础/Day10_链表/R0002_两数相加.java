package 学习计划.数据结构.数据结构基础.Day10_链表;

/**
 * @author Ren
 */

public class R0002_两数相加 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode cur = ans;
        while (l1 != null && l2 != null) {
            int res = (cur.val + l1.val + l2.val);
            if (res < 10) {
                cur.val = res;
                if (l1.next != null || l2.next != null) {
                    cur.next = new ListNode();
                    cur = cur.next;
                }
            } else {
                cur.val = res % 10;
                cur.next = new ListNode(res / 10);
                cur = cur.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int res = l1.val + cur.val;
            if (res < 10) {
                cur.val = res;
                if (l1.next != null) {
                    cur.next = new ListNode();
                    cur = cur.next;
                }
            } else {
                cur.val = res % 10;
                cur.next = new ListNode(res / 10);
                cur = cur.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            int res = l2.val + cur.val;
            if (res < 10) {
                cur.val = res;
                if (l2.next != null) {
                    cur.next = new ListNode();
                    cur = cur.next;
                }
            } else {
                cur.val = res % 10;
                cur.next = new ListNode(res / 10);
                cur = cur.next;
            }
            l2 = l2.next;
        }
        return ans;
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
