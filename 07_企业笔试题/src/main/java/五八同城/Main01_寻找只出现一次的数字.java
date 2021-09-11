package 五八同城;

import java.util.*;

/**
 * @author Ren
 */

public class Main01_寻找只出现一次的数字 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param arg int整型一维数组
     * @return int整型一维数组
     */
    public int[] find (int[] arg) {
        // write code here
        int len = arg.length;
        if(len==0) return new int[]{};
        if(len==1) return new int[]{arg[0]};
        List<Integer> ans = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int [] temp = new int[len];
        for (int i = 0; i < len; i++) {
            temp[i]=arg[i];
        }


        Arrays.sort(temp);
        for (int i = 0; i < len-1; i++) {
            if(temp[i]==temp[i+1]){
                set.add(temp[i]);
            }
        }
        if(temp[len-2]==temp[len-1]) set.add(temp[len-1]);

        for (int i = 0; i < len; i++) {
            if(set.add(arg[i])) ans.add(arg[i]);
        }

        int [] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

}
