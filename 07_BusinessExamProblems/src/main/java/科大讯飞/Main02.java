package 科大讯飞;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ren
 */

public class Main02 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回最短的区间长度，否则返回 -1
     *
     * @param str string字符串
     * @return int整型
     */
    public int findInterval(String str) {
        // write code here
        int l = 0, r = 0;
        Set<Character> set = new HashSet<>();
        int count = 0, min = 0;
        while (r <= str.length()) {
            if(str.charAt(r)=='?'){
                count++;
            }else{
                set.add(str.charAt(r));
            }

            if (set.size() + count == 26) {
                min = min > (l - r) ? l - r : min;
                l++;
                if(str.charAt(l)=='?'){
                    count--;
                }else{
                    set.remove(str.charAt(l));
                }
            }
            r++;
        }
        return min;
    }

}
