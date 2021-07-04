package 剑指Offer;

/**
 * @author Ren
 */

public class R35_复杂链表的复制 {


    public Node copyRandomList(Node head) {
        Node newHead = new Node(head.val);
        Node curr = newHead;

        while (head.next!=null){

        }
        return head;

    }


    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

}
