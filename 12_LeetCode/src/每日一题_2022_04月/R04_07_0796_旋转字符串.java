package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/7 00:30
 * @Description:
 */

public class R04_07_0796_旋转字符串 {

    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

}
