package 每日一题_2021_6月;

/**
 * @author Ren
 */

public class R06_05_0203_移除链表元素 {


    /**
     * 复制元素法
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        ListNode newCurrentNode = new ListNode(), newHead = newCurrentNode;
        while (head != null) {
            if (val != head.val) {
                newCurrentNode.next = new ListNode(head.val);
                newCurrentNode = newCurrentNode.next;
            }
            head = head.next;
        }
        return newHead.next;
    }



    class ListNode {
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

