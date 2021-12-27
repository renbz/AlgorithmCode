package LeetCode周赛.第273场;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/26 11:12
 * @Description:
 */

public class R5965_相同元素的间隔之和2 {
    public static void main(String[] args) {
        R5965_相同元素的间隔之和2 obj = new R5965_相同元素的间隔之和2();
        obj.getDistances(new int[]{2,1,3,1,2,3,3});
    }

    long [] ret ;
    public long[] getDistances(int[] arr) {
        ret = new long[arr.length];
        Map<Integer, List<Integer>> map = new LinkedHashMap<>();
        List<Integer> ans = new LinkedList<>();
        int[] arrCount = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
                arrCount[i] = 1;
            } else {
                List<Integer> list = map.get(arr[i]);
                list.add(i);
                arrCount[i] = list.size();
                map.put(arr[i], list);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            List<Integer> list = map.get(arr[i]);
            get(list, i,arrCount[i]-1);
        }
        return ret;
    }

    private void get(List<Integer> list, int k,int ind) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Math.abs(list.get(i) - list.get(ind));
        }
        ret[k] = sum;
    }
}
