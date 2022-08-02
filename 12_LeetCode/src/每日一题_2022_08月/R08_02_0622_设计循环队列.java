package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/2 20:54
 * @Description:
 */

public class R08_02_0622_设计循环队列 {

    class MyCircularQueue {
        Node head, tail;
        int count, k;

        public MyCircularQueue(int k) {
            count = 0;
            this.k = k;
        }

        public boolean enQueue(int value) {
            if (count == k) {
                return false;
            }
            Node node = new Node(value);
            count++;
            if (head == null) {
                node.next = node.pre = node;
                head = tail = node;
            } else {
                node.pre = tail;
                node.next = head;
                tail.next = node;
                tail = node;
                head.pre = tail;
            }
            return true;
        }

        public boolean deQueue() {
            if (count == 0) {
                return false;
            }
            count--;
            if (count == 0) {
                head = tail = null;
            } else {
                head = head.next;
                head.pre = tail;
                tail.next = head;
            }
            return true;
        }

        public int Front() {
            return count == 0 ? -1 : head.val;
        }

        public int Rear() {
            return count == 0 ? -1 : tail.val;
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == k;
        }
    }

    class Node {
        int val;
        Node pre, next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node pre, Node next) {
            this.val = val;
            this.pre = pre;
            this.next = next;
        }
    }

}
