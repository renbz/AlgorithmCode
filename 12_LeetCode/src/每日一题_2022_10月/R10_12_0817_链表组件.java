package 每日一题_2022_10月;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author renbingzhang
 * @Date: 2022/10/12 09:27
 * @Description:
 */

public class R10_12_0817_链表组件 {

    public int numComponents(ListNode head, int[] nums) {
        int ans = 0, tmp = 0;
        ListNode node = head;
        Set<Integer> collect = new HashSet<>();
        Arrays.stream(nums).forEach(collect::add);
        while (node != null) {
            if (collect.contains(node.val)) {
                tmp++;
            } else {
                ans += tmp > 0 ? 1 : 0;
                tmp = 0;
            }
            node = node.next;
        }
        return ans + (tmp > 0 ? 1 : 0);
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
