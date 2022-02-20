package 学习计划.剑指Offer专项突击版.Day21_22_前缀树;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 00:04
 * @Description:
 */

public class 剑指OfferII_065_最短的单词编码 {

    public int minimumLengthEncoding(String[] words) {
        Set<String> good = new HashSet<String>(Arrays.asList(words));
        for (String word : words) {
            for (int k = 1; k < word.length(); ++k) {
                good.remove(word.substring(k));
            }
        }

        int ans = 0;
        for (String word : good) {
            ans += word.length() + 1;
        }
        return ans;
    }
}
