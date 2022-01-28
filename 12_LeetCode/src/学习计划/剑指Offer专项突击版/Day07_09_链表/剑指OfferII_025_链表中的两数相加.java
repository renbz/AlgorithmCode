package 学习计划.剑指Offer专项突击版.Day07_09_链表;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/27 19:06
 * @Description:
 */

public class 剑指OfferII_025_链表中的两数相加 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> deque1 = new LinkedList<>();
        Deque<Integer> deque2 = new LinkedList<>();
        while (l1 != null) {
            deque1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            deque2.add(l2.val);
            l2 = l2.next;
        }
        ListNode ans = null;

        int carryBit = 0; //进位
        while (!deque1.isEmpty() && !deque2.isEmpty()) {
            int addRes = deque1.pollLast() + deque2.pollLast() + carryBit;
            carryBit = addRes / 10;
            int currBit = addRes % 10;

            ListNode node = new ListNode(currBit);
            node.next = ans;
            ans = node;
        }
        while (!deque1.isEmpty()) {
            int addRes = deque1.pollLast() + carryBit;
            carryBit = addRes / 10;
            int currBit = addRes % 10;

            ListNode node = new ListNode(currBit);
            node.next = ans;
            ans = node;
        }
        while (!deque2.isEmpty()) {
            int addRes = deque2.pollLast() + carryBit;
            carryBit = addRes / 10;
            int currBit = addRes % 10;

            ListNode node = new ListNode(currBit);
            node.next = ans;
            ans = node;
        }
        if(carryBit!=0){
            ListNode node = new ListNode(carryBit);
            node.next = ans;
            ans = node;
        }
        return ans;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


}
