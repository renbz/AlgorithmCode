package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/12 22:01
 * @Description:
 */

public class R04_12_0806_写字符串需要的行数 {

    public int[] numberOfLines(int[] widths, String s) {
        int ans[] = new int[2];
        ans[0] = 1;
        for (char c : s.toCharArray()) {
            int t = widths[c - 'a'];
            if (ans[1] + t > 100) {
                ans[1] = t;
                ans[0]++;
            } else {
                ans[1] += t;
            }
        }
        return ans;
    }

}
