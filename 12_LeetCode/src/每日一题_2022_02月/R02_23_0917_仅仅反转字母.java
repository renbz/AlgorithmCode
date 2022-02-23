package 每日一题_2022_02月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/23 21:23
 * @Description:
 */

public class R02_23_0917_仅仅反转字母 {

    public String reverseOnlyLetters(String s) {
        char[] cs = s.toCharArray();
        int n = cs.length;
        for (int i = 0, j = n - 1; i < j; ) {
            while (i < j && !Character.isLetter(cs[i])) i++;
            while (i < j && !Character.isLetter(cs[j])) j--;
            if (i < j) {
                char c = cs[i];
                cs[i++] = cs[j];
                cs[j--] = c;
            }
        }
        return String.valueOf(cs);
    }
}
