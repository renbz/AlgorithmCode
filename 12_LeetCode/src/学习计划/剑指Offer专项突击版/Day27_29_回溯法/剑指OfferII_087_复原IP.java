package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 20:44
 * @Description:
 */

public class 剑指OfferII_087_复原IP {

    List<String> ans = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        if (s == null || s.length() == 0) return ans;
        //1,2,3分割
        dfs(1, s, new StringBuilder(), 1);
        dfs(2, s, new StringBuilder(), 1);
        dfs(3, s, new StringBuilder(), 1);
        return ans;
    }

    private void dfs(int i, String s, StringBuilder sb, int d) {
        if (s.length() < i) return;
        int v = Integer.valueOf(s.substring(0, i));
        if (v > 255 || v <= Math.pow(10, i - 1) - 1 || d > 4) return;
        if (i >= 2 && s.charAt(0) == '0') return;
        sb.append(v).append(".");
        s = s.substring(i);
        int len = s.length();
        if (d == 4 && len == 0) ans.add(sb.substring(0, sb.length() - 1));
        if (len >= 1) dfs(1, s, new StringBuilder(sb), d + 1);
        if (len >= 2) dfs(2, s, new StringBuilder(sb), d + 1);
        if (len >= 3) dfs(3, s, new StringBuilder(sb), d + 1);
    }

}
