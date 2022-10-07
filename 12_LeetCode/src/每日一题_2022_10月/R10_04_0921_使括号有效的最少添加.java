package 每日一题_2022_10月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/7 20:00
 * @Description:
 */

public class R10_04_0921_使括号有效的最少添加 {

    public int minAddToMakeValid(String s) {
        int ans = 0;
        int leftCount = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                leftCount++;
            } else {
                if (leftCount > 0) {
                    leftCount--;
                } else {
                    ans++;
                }
            }
        }
        ans += leftCount;
        return ans;
    }

}
