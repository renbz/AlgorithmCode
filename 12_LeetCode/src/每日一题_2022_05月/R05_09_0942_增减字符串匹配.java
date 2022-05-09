package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/9 17:36
 * @Description:
 */

public class R05_09_0942_增减字符串匹配 {

    public int[] diStringMatch(String s) {
        int n = s.length(), l = 0, r = n;
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            ans[i] = s.charAt(i) == 'I' ? l++ : r--;
        }
        ans[n] = l;
        return ans;
    }

}
