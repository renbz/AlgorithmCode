package Other;

/**
 * @author Ren
 */

public class R1143_2_最长公共子串 {

    public static void main(String[] args) {

        String str1 = "abcmdf";
        String str2 = "abcmf";
        System.out.println(longestCommonSubstring(str1, str2));

    }

    public static int longestCommonSubstring(String str1, String str2) {

        int len1 = str1.length(), len2 = str2.length();
        int dp[][] = new int[len1 + 1][len2 + 1];

        int max = -1;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]+1;
                    max = max > dp[i][j] ? max : dp[i][j];
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return max;
    }


}
