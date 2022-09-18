package 每日一题_2022_09月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/9/18 22:11
 * @Description:
 */

public class R09_17_1624_两个相同字符之间的最长子字符串 {

    public int maxLengthBetweenEqualCharacters(String s) {
        int[] firstIndex = new int[26];
        Arrays.fill(firstIndex, -1);
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            if (firstIndex[s.charAt(i) - 'a'] < 0) {
                firstIndex[s.charAt(i) - 'a'] = i;
            } else {
                maxLength = Math.max(maxLength, i - firstIndex[s.charAt(i) - 'a'] - 1);
            }
        }
        return maxLength;
    }

}
