package 学习计划.剑指Offer专项突击版.Day07_09_链表;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/28 09:50
 * @Description:
 */

public class 剑指OfferII_028_展平多级双向链表 {

    public Node flatten(Node head) {
        dfs(head);
        return head;
    }

    private Node dfs(Node node) {
        Node cur = node;
        // 记录链表的最后一个节点
        Node last = null;
        while (cur != null) {
            Node next = cur.next;
            // 如果有子节点 那么先处理子节点
            if (cur.child != null) {
                Node childLast = dfs(cur.child);
                next = cur.next;
                // 将node和child相连
                cur.next = cur.child;
                cur.child.prev = cur;
                // 如果next不为空，就将last和next相连
                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }
                // 将child置为空
                cur.child = null;
                last = childLast;
            } else {
                last = cur;
            }
            cur = next;
        }
        return last;
    }


    class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    }

}
