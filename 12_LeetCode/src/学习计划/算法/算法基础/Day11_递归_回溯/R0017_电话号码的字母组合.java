package 学习计划.算法.算法基础.Day11_递归_回溯;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 20:37
 * @Description:
 */

public class R0017_电话号码的字母组合 {

    List<String> list = new ArrayList<>();
    String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return list;
        f(Integer.valueOf(String.valueOf(digits.charAt(0))), digits.substring(1, digits.length()), new StringBuilder());
        return list;
    }

    public void f(int index, String digits, StringBuilder build) {
        if (digits.length() == 0) {
            for (int i = 0; i < map[index].length(); i++) {
                StringBuilder t_build = new StringBuilder(build);
                t_build.append(map[index].charAt(i));
                list.add(t_build.toString());
            }
        } else {
            for (int i = 0; i < map[index].length(); i++) {
                StringBuilder t_build = new StringBuilder(build);
                t_build.append(map[index].charAt(i));
                f(Integer.valueOf(String.valueOf(digits.charAt(0))), digits.substring(1, digits.length()), t_build);
            }
        }
    }
}
