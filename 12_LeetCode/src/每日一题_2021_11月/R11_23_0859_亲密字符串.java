package 每日一题_2021_11月;

import java.util.Arrays;

/**
 * @author Ren
 */

public class R11_23_0859_亲密字符串 {

    public boolean buddyStrings(String s, String goal) {
        int count = 0;
        int[] a = new int[2];
        if (s.length() != goal.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (++count > 2) return false;
                else a[count - 1] = i;
            }
        }
        boolean flag = false;
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]==chars[i+1]) {
                flag = true;
                break;
            }
        }


        if(count==0 && flag) return true;
        else if(count==0) return false;
        if(s.charAt(a[0])==goal.charAt(a[1]) && goal.charAt(a[0])==s.charAt(a[1])){
            return true;
        }
        return false;
    }
}
