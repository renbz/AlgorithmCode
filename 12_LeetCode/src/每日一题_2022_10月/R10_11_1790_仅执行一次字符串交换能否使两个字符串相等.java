package 每日一题_2022_10月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author renbingzhang
 * @Date: 2022/10/11 14:13
 * @Description:
 */

public class R10_11_1790_仅执行一次字符串交换能否使两个字符串相等 {

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        List<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                indexList.add(i);
            }
        }
        return s1.equals(s2) || (indexList.size() == 2 && s1.charAt(indexList.get(0)) == s2.charAt(indexList.get(1)) && s1.charAt(indexList.get(1)) == s2.charAt(indexList.get(0)));
    }

}
