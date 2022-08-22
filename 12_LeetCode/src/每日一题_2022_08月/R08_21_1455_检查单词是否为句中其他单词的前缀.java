package 每日一题_2022_08月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:59
 * @Description:
 */

public class R08_21_1455_检查单词是否为句中其他单词的前缀 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int n = sentence.length(), index = 1, start = 0, end = 0;
        while (start < n) {
            while (end < n && sentence.charAt(end) != ' ') {
                end++;
            }
            if (isPrefix(sentence, start, end, searchWord)) {
                return index;
            }

            index++;
            end++;
            start = end;
        }
        return -1;
    }

    public boolean isPrefix(String sentence, int start, int end, String searchWord) {
        for (int i = 0; i < searchWord.length(); i++) {
            if (start + i >= end || sentence.charAt(start + i) != searchWord.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
