package 学习计划.编程能力.编程能力基础.Day02;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/9 23:51
 * @Description:
 */

public class R0459_重复的子字符串 {

    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

}
