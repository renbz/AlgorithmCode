package 学习计划.算法基础.Day15_动态规划;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 10:25
 * @Description:
 */

public class R0139_单词拆分 {

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDicSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDicSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

}
