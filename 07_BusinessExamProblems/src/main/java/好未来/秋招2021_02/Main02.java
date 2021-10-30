package 好未来.秋招2021_02;

/**
 * @author Ren
 */

public class Main02 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param list ListNode类
     * @param k    int整型
     * @return ListNode类
     */
    public ListNode reverseKGroup(ListNode list, int k) {
        // write code here

        ListNode currentNode = list;
        int count = 0;
        while (currentNode != null && count != k) {
            currentNode = currentNode.next;
            count++;
        }
        if (count == k) {
            currentNode = reverseKGroup(currentNode, k);
            while (count != 0) {
                count--;
                ListNode temp = list.next;
                list.next = currentNode;
                currentNode = list;
                list = temp;
            }
            list = currentNode;
        }
        return list;

    }

    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

}
