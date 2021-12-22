package 学习计划.数据结构入门.Day06_字符串;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/22 11:24
 * @Description:
 */

public class R0387_字符串中的第一个唯一字符 {

    public int firstUniqChar(String s) {
        int len = s.length();
        boolean[] flag = new boolean[len];
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = len - 1; i >= 0; i--) {
            if(!set1.add(s.charAt(i))) flag[i]=true;
        }
        for (int i = 0; i < len; i++) {
            if(!set2.add(s.charAt(i))) flag[i]=true;
        }

        for (int i = 0; i < len; i++) {
            if(!flag[i]) return i;
        }
        return -1;
    }
}
