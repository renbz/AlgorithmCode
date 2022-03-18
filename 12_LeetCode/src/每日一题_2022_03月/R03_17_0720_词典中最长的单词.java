package 每日一题_2022_03月;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/18 11:43
 * @Description:
 */

public class R03_17_0720_词典中最长的单词 {

    public String longestWord(String[] words) {
        Set<String> wordSet = new HashSet<>();
        for (String word : words) wordSet.add(word);
        Arrays.sort(words, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
        for (String word : words) {
            boolean good = true;
            for (int k = 1; k < word.length(); k++) {
                if (!wordSet.contains(word.substring(0, k))) {
                    good = false;
                    break;
                }
            }
            if (good) return word;
        }
        return "";
    }

}
