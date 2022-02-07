package 每日一题_2022_02月;

import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/7 14:04
 * @Description:
 */

public class R02_07_1405_最长快乐字符串 {

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        PriorityQueue<int[]> sortQueue = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        //初始化存储数据的大根堆
        if (a > 0) sortQueue.add(new int[]{0, a});
        if (b > 0) sortQueue.add(new int[]{1, b});
        if (c > 0) sortQueue.add(new int[]{2, c});
        while (!sortQueue.isEmpty()) {
            // 取出当前字符剩余数量最大的元素
            int[] cur = sortQueue.poll();
            // 当前快乐串长度
            int n = ans.length();
            // 如果ans的长度大于2 ,对当前字符和前两位字符判重
            if (n >= 2 && ans.charAt(n - 1) - 'a' == cur[0] && ans.charAt(n - 2) - 'a' == cur[0]) {
                // 如果是连续相同的 我们需要进行第一次判断当前队列中是否还有剩余数量的其他字符
                if (sortQueue.isEmpty()) break;
                // 取出当前第二大剩余数量字符
                int[] next = sortQueue.poll();
                // 拼接到结果
                ans.append((char) (next[0] + 'a'));
                // 如果拼接字符的剩余数量不为0时 把它添加到大根堆中再次排序
                if (--next[1] != 0) sortQueue.add(next);
                // 因为没有用到当前字符，所以将其添加会大根堆
                sortQueue.add(cur);
            } else {
                // 如果不是连续两个相同，直接将其拼入结果
                ans.append((char) (cur[0] + 'a'));
                // 判断当前字符是否还有剩余数量 如果有就把它重新放回堆中排序
                if (--cur[1] != 0) sortQueue.add(cur);
            }
        }
        return ans.toString();

    }

}
