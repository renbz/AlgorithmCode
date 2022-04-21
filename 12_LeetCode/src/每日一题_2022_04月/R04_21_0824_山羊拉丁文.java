package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/21 12:27
 * @Description:
 */

public class R04_21_0824_山羊拉丁文 {

    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        StringBuilder builder = new StringBuilder("maa");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (!vowel(words[i])) {
                words[i] = (new StringBuilder(words[i].substring(1, words[i].length())).append(words[i].charAt(0))).toString();
            }
            ans.append(words[i]).append(builder).append(" ");
            builder.append("a");
        }
        return ans.toString().substring(0, ans.length() - 1);

    }

    public boolean vowel(String s) {
        char c = s.charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

}
