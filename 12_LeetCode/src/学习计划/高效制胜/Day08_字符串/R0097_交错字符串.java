package 学习计划.高效制胜.Day08_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 21:12
 * @Description:
 */

public class R0097_交错字符串 {

    /**
     * 首先如果 |s1|+|s2|≠|s3|,那s3必然不可能由s1和s2交错组成。
     * 在 |s1|+|s2|=|s3|时，使用动态规划来求解。
     * 我们定义f(i,j)表示s1的前i个元素和s2的前j个元素能否交错组成s3的前i+j个元素。 如果s1的第i个元素和s3的第(i+j)个元素相等
     * 那么s1的前i个元素和s2 的前j个元素是否 能交错组成s3的前i+j个元素,
     * 取决于s1的前i-1个元素和s2的前j个元素是否能交错组成s3的前i+j-1个元素，
     * 即此时f(i,j)取决于f(i-1,j),在此情况下如果f(i-1,j)为真，则f(i,j)也为真。
     * 同样的，如果s2的第j个元素和s3的第i+j个元素相等并且f(i,j-1)为真，则f(i,j)也为真。
     * 于是我们推导出动态规划方程:  f(i,j) = [f(i-1,j) && s1(i-1)==s3(p)] || [f(i,j-1) && s2(j-1)==s3(p)]
     * 其中 p=i+j-1,边界条件f(0,0)=true。
     */
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) return false;
        boolean[][] ans = new boolean[len1 + 1][len2 + 1];
        ans[0][0] = true;
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                int p = i + j - 1;
                if (i > 0) ans[i][j] = ans[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p);
                if (j > 0) ans[i][j] = ans[i][j] || (ans[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
            }
        }
        return ans[len1][len2];
    }

}
