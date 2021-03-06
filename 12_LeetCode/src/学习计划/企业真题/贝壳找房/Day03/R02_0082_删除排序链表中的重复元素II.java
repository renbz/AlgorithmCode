package 学习计划.企业真题.贝壳找房.Day03;

/**
 * @author Ren
 */

public class R02_0082_删除排序链表中的重复元素II {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while (cur.next!=null && cur.next.next!=null){
            if(cur.next.val == cur.next.next.val){
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
