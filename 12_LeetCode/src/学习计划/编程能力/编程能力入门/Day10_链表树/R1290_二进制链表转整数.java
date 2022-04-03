package 学习计划.编程能力.编程能力入门.Day10_链表树;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/2 21:34
 * @Description:
 */

public class R1290_二进制链表转整数 {

    public int getDecimalValue(ListNode head) {
        ListNode curNode = head;
        int ans = 0;
        while (curNode != null) {
            ans = ans * 2 + curNode.val;
            curNode = curNode.next;
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
