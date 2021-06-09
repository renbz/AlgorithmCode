package ch02;

/**
 * @author Ren
 */
public class T06_从尾到头打印链表_递归 {

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

    public static void printNode(Node node) {
        if (node != null) {
            if (node.next != null) {
                printNode(node.next);  //递归
            }
            System.out.print(node.data+"  ");
        }
    }

}

