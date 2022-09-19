package 每日一题_2022_09月;

import java.util.PriorityQueue;

/**
 * @author renbingzhang
 * @Date: 2022/9/19 09:08
 * @Description:
 */

public class R09_19_1636_按照频率将数组升序排序 {

    public int[] frequencySort(int[] nums) {
        // 频率升序,数值降序,使用小根堆
        int[] countNums = new int[201];
        for (int num : nums) {
            countNums[num + 100]++;
        }
        // 创建指定排序规则的小根堆，向小根堆中赋值
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((o1, o2) ->
                o1.getCount() == o2.getCount() ? o2.getNum() - o1.getNum() : o1.getCount() - o2.getCount()
        );
        for (int i = 0; i < countNums.length; i++) {
            minHeap.add(new Pair(i - 100, countNums[i]));
        }
        // 取出数据生成答案
        int[] ans = new int[nums.length];
        int i = 0;
        while (!minHeap.isEmpty()) {
            Pair pair = minHeap.poll();
            for (int c = 0; c < pair.getCount(); c++) {
                ans[i++] = pair.getNum();
            }
        }
        return ans;
    }

    class Pair {
        int num;
        int count;

        public Pair(int num, int count) {
            this.num = num;
            this.count = count;
        }

        public int getNum() {
            return num;
        }

        public void setNum(Integer num) {
            this.num = num;
        }

        public int getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

}
