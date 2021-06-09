package R02_链表;

/**
 * @author Ren
 */

public class R001_单链表反转 {
    static Node head =new Node(1);

    public static void main(String[] args) {
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println("链表初始序列: ");
        printLinkList();
        reverseLinkList();
        System.out.println("\n链表反转后序列: ");
        printLinkList();
    }

    /**
     * curNode 当前节点为head
     * preNode 为上一个节点
     * nextNode 为下一个节点
     */
    public static void reverseLinkList(){

        Node curNode = head;
        Node preNode = null;
        Node nextNode = null;

        while (curNode != null){
            nextNode = curNode.next;  //记录当前节点的下一个节点
            curNode.next = preNode;   // 将当前节点的下一个节点指针  指向上一个节点 实现反转
            preNode = curNode;        // 更新preNode节点 即后移一位
            curNode = nextNode;       // 更新curNode节点
        }
        head = preNode;
    }
    public static void printLinkList(){
        Node tmp = head;
         while (tmp != null){
             System.out.print(tmp.data+"  ");
             tmp = tmp.next;
         }
    }
}

