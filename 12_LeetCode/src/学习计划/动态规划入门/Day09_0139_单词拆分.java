package 学习计划.动态规划入门;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/14 12:43
 * @Description:
 */

public class Day09_0139_单词拆分 {

    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        Set<String> set = new HashSet<>(wordDict);
        boolean dp[] = new boolean[len + 1];
        dp[0] = true;
        for (int i = 1; i <= len; i++) {
            for (int j = 0; j < i; j++) {
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }

}
