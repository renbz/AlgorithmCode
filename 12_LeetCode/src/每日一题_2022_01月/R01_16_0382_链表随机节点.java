package 每日一题_2022_01月;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/16 14:26
 * @Description:
 */

public class R01_16_0382_链表随机节点 {

    class Solution {
        List<Integer> list;
        Random random;

        public Solution(ListNode head) {
            list = new ArrayList<Integer>();
            while (head != null) {
                list.add(head.val);
                head = head.next;
            }
            random = new Random();
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
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
