package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/2 14:59
 * @Description:
 */

public class R02_02_2000_反转单词前缀 {

    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        } else {
            StringBuilder ans = new StringBuilder(word.substring(0, index + 1)).reverse().append(word.substring(index + 1));
            return ans.toString();
        }
    }

}
