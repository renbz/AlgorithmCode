package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/7 12:43
 * @Description:
 */

public class R01_07_1614_括号的最大嵌套深度 {

    public int maxDepth(String s) {
        int ans = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') count++;
            ans = Math.max(ans, count);
            if (s.charAt(i) == ')') count--;
        }
        return ans;
    }
}
