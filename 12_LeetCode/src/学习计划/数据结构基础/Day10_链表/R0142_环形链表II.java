package 学习计划.数据结构基础.Day10_链表;

/**
 * @author Ren
 */

public class R0142_环形链表II {

    /**
     *
                       C--------
                      /         \-----相遇点
           L         /           \
     ---------------/             \
                    \             /
                     \           /
                      \         / D
                       \-------/

     快慢指针相遇时，慢指针 走过的节点数  L+C,快指针走过的节点数  L+C+D+C
     所以  --->     2*(L+C) = (L+2C+D)  =>  L=D
     所以  当相遇时，head(temp)节点和慢指针同时走   相遇时就是环的第一个节点
     */

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        ListNode temp  = head;
        while (slow != temp) {
            slow = slow.next;
            temp = temp.next;
        }
        return temp;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
