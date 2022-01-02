package 学习计划.算法基础.Day14_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/1 11:52
 * @Description:
 */

public class R0005_最长回文子串2 {

    public String longestPalindrome(String s) {
        String result = "";
        boolean table[][] = new boolean[s.length()][s.length()];
        // length === 1;
        for (int i = 0; i < table.length; i++) {
            table[i][i] = true;
            result = s.substring(i, i + 1);
        }

        // length === 2;
        for (int i = 0; i < table.length - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = true;
                result = s.substring(i, i + 2);
            } else {
                table[i][i + 1] = false;
            }
        }

        // length > 2;
        for (int len = 3; len <= table.length; len++) {
            for (int i = 0; i + len <= table.length; i++) {
                char front = s.charAt(i);
                char end = s.charAt(i + len - 1);
                if (front == end) {
                    table[i][i + len - 1] = table[i + 1][i + len - 2];
                } else {
                    table[i][i + len - 1] = false;
                }
                if(table[i][i + len - 1]){
                    result = s.substring(i, i + len);
                }
            }
        }
        return result;
    }

}
