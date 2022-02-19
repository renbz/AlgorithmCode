package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 17:45
 * @Description:
 */

public class 剑指OfferII_086_分割回文子字符串 {

    public String[][] partition(String s) {
        //动态规划+回溯
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        //初始化
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        char[] chs = s.toCharArray();
        //动态方程：dp[i][j] = chs[i] == chs[j] && dp[i+1][j-1];
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                dp[j][j + i] = i == 1 ? chs[j] == chs[j + i] : chs[j] == chs[j + i] && dp[j + 1][j + i - 1];
            }
        }
        List<List<String>> lsit = new ArrayList<>();
        backtrack(0, lsit, new ArrayList<String>(), dp, s, len);
        String[][] arrS = new String[lsit.size()][];
        for (int i = 0; i < arrS.length; i++) {
            List<String> _list = lsit.get(i);
            int _len = _list.size();
            arrS[i] = new String[_len];
            for (int j = 0; j < _len; j++) arrS[i][j] = _list.get(j);
        }
        return arrS;
    }

    private void backtrack(int j, List<List<String>> lsit, List<String> _list, boolean[][] dp, String s, int len) {
        if (j > len - 1) {
            lsit.add(new ArrayList<>(_list));
        } else {
            for (int i = j; i < len; i++) {
                if (!dp[j][i]) continue;
                _list.add(s.substring(j, i + 1));
                backtrack(i + 1, lsit, _list, dp, s, len);
                _list.remove(_list.size() - 1);
            }
        }
    }

}
