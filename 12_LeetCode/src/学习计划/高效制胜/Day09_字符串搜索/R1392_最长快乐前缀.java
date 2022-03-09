package 学习计划.高效制胜.Day09_字符串搜索;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/8 23:29
 * @Description:
 */

public class R1392_最长快乐前缀 {

    public String longestPrefix(String s) {
        int len = s.length();
        String ans = "";
        for (int i = 0; i < len-1; i++) {
            if (s.substring(0, i).equals(s.substring(len - i, len))) {
                ans = s.substring(0, i);
            }
        }
        return ans;
    }

}
