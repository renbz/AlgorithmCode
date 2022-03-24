package 学习计划.算法.算法基础.Day03_双指针;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 15:45
 * @Description:
 */

public class R0082_删除排序链表中的重复元素II {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode cur = new ListNode(0, head);
        ListNode ans = cur;


        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
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
