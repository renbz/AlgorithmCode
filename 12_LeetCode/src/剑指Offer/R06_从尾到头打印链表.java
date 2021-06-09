package 剑指Offer;

/**
 * @author Ren
 */

public class R06_从尾到头打印链表 {

    public int[] reversePrint(ListNode head) {
        int nodeSize = 0;
        ListNode currentNode = head;
        while (currentNode!=null){
            nodeSize++;
            currentNode = currentNode.next;
        }
        int [] arr = new int[nodeSize];
        for (int i = nodeSize-1; i >=0; i--) {
            arr[i] = head.val;
            head = head.next;
        }
        return arr;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
