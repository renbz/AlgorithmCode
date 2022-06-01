package 每日一题_2022_06月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/1 22:04
 * @Description:
 */

public class R06_01_0473_火柴拼正方形 {
    int[] ms;
    int t;

    public boolean makesquare(int[] matchsticks) {
        ms = matchsticks;
        int totalLen = Arrays.stream(matchsticks).sum();
        if (totalLen % 4 != 0) return false;
        t = totalLen / 4;
        Arrays.sort(matchsticks);
        return dfs(matchsticks.length - 1, new int[4]);
    }

    private boolean dfs(int idx, int[] cur) {
        if (idx == -1) return true;
        out:
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                if (cur[j] == cur[i]) continue out;
            }
            int u = ms[idx];
            if (cur[i] + u > t) continue;
            cur[i] += u;
            if (dfs(idx - 1, cur)) return true;
            cur[i] -= u;
        }
        return false;
    }

}
