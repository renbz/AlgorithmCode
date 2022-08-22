package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:47
 * @Description:
 */

public class R08_14_1422_分割字符串的最大得分 {

    public int maxScore(String s) {
        int score = 0;
        int n = s.length();
        if (s.charAt(0) == '0') {
            score++;
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1') {
                score++;
            }
        }
        int ans = score;
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                score++;
            } else {
                score--;
            }
            ans = Math.max(ans, score);
        }
        return ans;
    }

}
