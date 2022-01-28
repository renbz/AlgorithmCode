package 学习计划.剑指Offer专项突击版.Day07_09_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/28 14:58
 * @Description:
 */

public class 剑指OfferII_029_排序的循环链表 {

    public Node insert(Node head, int insertVal) {
        if (head == null) {
            head.val = insertVal;
            return head;
        }
        return null;
    }


    class Node {
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    }

    ;
}
