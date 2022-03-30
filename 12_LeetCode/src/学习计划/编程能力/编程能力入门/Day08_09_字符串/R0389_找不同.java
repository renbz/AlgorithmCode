package 学习计划.编程能力.编程能力入门.Day08_09_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 18:30
 * @Description:
 */

public class R0389_找不同 {

    public char findTheDifference(String s, String t) {
        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i) ^ t.charAt(i);
        }
        ans ^= t.charAt(t.length() - 1);

        return ans;
    }

}
