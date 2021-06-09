package 每日一题_2021_6月;

/**
 * @author Ren
 */

public class R06_04_0160_相交链表 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

         /*// 双重for循环遍历链表
         for(ListNode A=headA;A!=null;A=A.next){
             for(ListNode B=headB;B!=null;B=B.next){
                 if(A.equals(B)){
                     return A;
                 }
             }
         }
         return null;


         // 设置双指针
         ListNode A = headA;
         ListNode B = headB;
         while(true){
             if(A==B) return A;
             if(A==null && B==null) return null;
             A=A.next;
             B=B.next;
             if(A==null && B!=null) A = headB;
             if(A!=null && B==null) B = headA;

         }*/


        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }



    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}

