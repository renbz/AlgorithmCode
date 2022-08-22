package 每日一题_2022_08月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:23
 * @Description:
 */

public class R08_03_0899_有序队列 {

    public String orderlyQueue(String s, int k) {
        if (k == 1) {
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            int n = s.length();
            for (int i = 1; i < n; i++) {
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                if (sb.toString().compareTo(smallest) < 0) {
                    smallest = sb.toString();
                }
            }
            return smallest;
        } else {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
    }

}
