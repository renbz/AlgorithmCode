package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 10:07
 * @Description:
 */

public class LCP30_魔塔游戏 {

    public int magicTower(int[] nums) {
        int sum = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum <= 0) return -1; //算出所有回合后的血量是否为正数

        // 开始模拟
        /**
         * 首先，我们计算一遍所有回合之后的血量，如果是负数，则直接返回-1
         * 然后我们模拟过程，将之前扣减的血量都放入优先队列中，每次快死之前，就取出堆顶的元素（扣最多的血）给自己加上，
         * 这样的贪心思想能保证我们移动到尾部的元素是最少的。
         */
        long blood = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for (int num : nums) {
            if (num < 0) pq.offer(num);
            if (blood + num <= 0) {
                // ∵ 这会合过后就要死了,所以把之前扣的最多的血量移到最后去
                ans++;
                blood -= pq.poll(); // 加回之前扣除最多的血量
            }
            blood += num;
        }
        return ans;
    }

}
