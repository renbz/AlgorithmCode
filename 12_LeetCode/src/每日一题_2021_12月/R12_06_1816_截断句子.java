package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/6 09:12
 * @Description:
 */

public class R12_06_1816_截断句子 {

    public String truncateSentence(String s, int k) {
        int count = 0, index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    index = i;
                    break;
                }
            }
        }
        return count < k ? s : s.substring(0, index);
    }
}
