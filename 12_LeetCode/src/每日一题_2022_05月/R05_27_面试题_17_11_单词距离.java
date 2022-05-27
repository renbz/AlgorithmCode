package 每日一题_2022_05月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/27 20:35
 * @Description:
 */

public class R05_27_面试题_17_11_单词距离 {

    public int findClosest(String[] words, String word1, String word2) {
        int length = words.length;
        int ans = length;
        int index1 = -1, index2 = -1;
        for (int i = 0; i < length; i++) {
            String word = words[i];
            if (word.equals(word1)) {
                index1 = i;
            } else if (word.equals(word2)) {
                index2 = i;
            }
            if (index1 >= 0 && index2 >= 0) {
                ans = Math.min(ans, Math.abs(index1 - index2));
            }
        }
        return ans;
    }
}
