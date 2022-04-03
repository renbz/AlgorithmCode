package 学习计划.编程能力.编程能力入门.Day08_09_字符串;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/2 20:49
 * @Description:
 */

public class R1309_解码字母到整数映射 {

    public String freqAlphabets(String s) {
        // 1 - 9 只有一位数， 10 - 26 有 10# - 26# 三位数
        StringBuilder sb = new StringBuilder();
        char[] map = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = s.length()-1; i >= 0; ) {
            if (s.charAt(i) == '#') {
                sb.append(map[Integer.valueOf(s.substring(i - 2, i)) - 1]);
                i -= 3;
            }else{
                sb.append(map[Integer.valueOf(s.substring(i, i+1)) - 1]);
                i--;
            }
        }
        return sb.reverse().toString();
    }

}
