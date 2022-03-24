package 学习计划.数据结构.数据结构基础.Day12_链表;

import java.util.List;

/**
 * @author Ren
 */

public class R0707_设计链表 {
    class MyLinkedList {

        int size;
        ListNode head;  // sentinel node as pseudo-head

        public MyLinkedList() {
            size = 0;
            head = new ListNode(0);
        }

        public int get(int index) {
            if (index < 0 || index >= size) return -1;
            ListNode curr = head;
            for (int i = 0; i <= index; i++) curr = curr.next;  //因为head不存储数据 所以多执行一次
            return curr.val;
        }

        public void addAtHead(int val) {
            addAtIndex(0, val);
        }

        public void addAtTail(int val) {
            addAtIndex(size, val);
        }

        /**
         * head不存储数据
         *
         * @param index
         * @param val
         */
        public void addAtIndex(int index, int val) {
            if (index > size) return;
            if (index < 0) index = 0;
            size++;
            ListNode pred = head;
            for (int i = 0; i < index; ++i) pred = pred.next;
            ListNode toAdd = new ListNode(val);
            toAdd.next = pred.next;
            pred.next = toAdd;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= size) return;
            size--;
            ListNode pred = head;
            for (int i = 0; i < index; ++i) pred = pred.next;
            pred.next = pred.next.next;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
