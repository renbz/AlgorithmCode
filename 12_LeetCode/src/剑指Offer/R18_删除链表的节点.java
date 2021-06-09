package 剑指Offer;

/**
 * @author Ren
 */

public class R18_删除链表的节点 {

    public ListNode deleteNode(ListNode head, int val) {
        if(head==null) return null;
        if(head.val == val ) return head = head.next;
        head.next = deleteNode(head.next,val);
        return head;
    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

}
