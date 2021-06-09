package ch02;

import java.util.Stack;

/**
 * @author Ren
 */

public class T06_从尾到头打印链表_栈 {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        printNode(node1);
    }

    public static void printNode(Node firstNode) {

        Stack stack = new Stack();
        Node node = firstNode;
        while (node != null) {
            stack.push(node);
            node = node.next;
        }

        while (!stack.empty()) {
            node = (Node) stack.pop();
            System.out.print(node.data + "  ");
        }
    }

}

class Node {
    Object data; //每个节点的数据
    Node next; // 每个节点指向下一个节点的连接

    public Node(Object data) {
        this.data = data;
    }
}
