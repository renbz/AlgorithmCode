package 学习计划.剑指Offer专项突击版.Day07_09_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/28 09:36
 * @Description:
 */

public class 剑指OfferII_027_回文链表 {

    public boolean isPalindrome(ListNode head) {
        StringBuilder builder = new StringBuilder();
        while (head != null) {
            builder.append(head.val);
            head = head.next;
        }

        String s = builder.toString();
        if (s.equals(builder.reverse().toString())) return true;
        return false;
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
