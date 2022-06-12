package 每日一题_2022_06月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/11 22:10
 * @Description:
 */

public class R06_11_0926_将字符串翻转到单调递增 {

    public int minFlipsMonoIncr(String s) {
        int n = s.length(), dp0 = 0, dp1 = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int dp0New = dp0, dp1New = Math.min(dp0, dp1);
            if (c == '1') dp0New++;
            else dp1New++;
            dp0 = dp0New;
            dp1 = dp1New;
        }
        return Math.min(dp0, dp1);
    }

}
