package 学习计划.剑指Offer专项突击版.Day07_09_链表;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/28 14:58
 * @Description:
 */

public class 剑指OfferII_029_排序的循环链表 {

    public Node insert(Node head, int insertVal) {
        // 若head不存在
        if (head == null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        Set<Node> set = new HashSet<>();
        // 找到最小和最大的节点  比max大或比min小插入其间，max和min是相邻的
        Node max = head, min = head, cur = head;
        while (cur.val <= cur.next.val && set.add(cur)) {
            cur = cur.next;
            if (cur.val >= max.val) max = cur;
        }
        min = max.next;
        if (insertVal > max.val || insertVal < min.val) {
            Node node = new Node(insertVal);
            node.next = max.next;
            max.next = node;
        } else {
            // 只有一个节点
            if (cur.val == cur.next.val) {
                Node node = new Node(insertVal);
                node.next = cur.next;
                cur.next = node;
            } else {
                while (true) {
                    if (cur.val <= insertVal && cur.next.val >= insertVal) {
                        Node node = new Node(insertVal);
                        node.next = cur.next;
                        cur.next = node;
                        break;
                    }
                    cur = cur.next;
                }
            }

        }
        return head;
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
}
