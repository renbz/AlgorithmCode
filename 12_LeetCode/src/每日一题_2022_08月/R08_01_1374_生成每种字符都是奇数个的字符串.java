package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/1 19:31
 * @Description:
 */

public class R08_01_1374_生成每种字符都是奇数个的字符串 {

    public String generateTheString(int n) {
        if (n == 1) return "a";
        if (n == 2) return "ab";
        if (n == 3) return "abc";
        StringBuilder ans = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i <= n - 2; i++) {
                ans.append("a");
            }
            ans.append("b");
            return ans.toString();
        } else {
            for (int i = 0; i <= n - 3; i++) {
                ans.append("a");
            }
            ans.append("b").append("c");
        }
        return ans.toString();
    }

}
