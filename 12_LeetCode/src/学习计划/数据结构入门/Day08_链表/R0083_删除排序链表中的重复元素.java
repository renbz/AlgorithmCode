package 学习计划.数据结构入门.Day08_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 13:04
 * @Description:
 */

public class R0083_删除排序链表中的重复元素 {


    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode cur = head;
        while (cur.next!=null){
            if(cur.val == cur.next.val)  cur.next = cur.next.next;
            else cur = cur.next;
        }
        return head;
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
