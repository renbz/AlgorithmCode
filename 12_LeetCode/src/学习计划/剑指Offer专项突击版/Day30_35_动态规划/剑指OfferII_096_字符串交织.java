package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 14:12
 * @Description:
 */

public class 剑指OfferII_096_字符串交织 {

    public boolean isInterleave(String s1, String s2, String s3) {
        int a = 0, b = 0, c = 0, len1 = s1.length(), len2 = s2.length(), len3 = s3.length();
        if (len1 + len2 != len3) return false;

        boolean[][] f = new boolean[len1 + 1][len2 + 1];
        f[0][0] = true;
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                int p = i + j - 1;
                if (i > 0) f[i][j] = f[i][j] || (f[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p));
                if (j > 0) f[i][j] = f[i][j] || (f[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p));
            }
        }
        return f[len1][len2];
    }

}
