package 学习计划.数据结构基础.Day12_链表;

/**
 * @author Ren
 */

public class R0024_两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        if(node==null) return null;
        if(node.next==null) return node;

        ListNode t = node.next.next;
        ListNode f = node.next;
        node.next.next = node;
        node.next = swapPairs(t);
        return f;
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
