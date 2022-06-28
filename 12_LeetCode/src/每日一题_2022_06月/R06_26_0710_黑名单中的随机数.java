package 每日一题_2022_06月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/28 15:12
 * @Description:
 */

public class R06_26_0710_黑名单中的随机数 {

    class Solution {
        Map<Integer, Integer> b2w;
        Random random;
        int bound;

        public Solution(int n, int[] blacklist) {
            b2w = new HashMap<Integer, Integer>();
            random = new Random();
            int m = blacklist.length;
            bound = n - m;
            Set<Integer> black = new HashSet<Integer>();
            for (int b : blacklist) {
                if (b >= bound) {
                    black.add(b);
                }
            }

            int w = bound;
            for (int b : blacklist) {
                if (b < bound) {
                    while (black.contains(w)) {
                        ++w;
                    }
                    b2w.put(b, w);
                    ++w;
                }
            }
        }

        public int pick() {
            int x = random.nextInt(bound);
            return b2w.getOrDefault(x, x);
        }
    }

}
