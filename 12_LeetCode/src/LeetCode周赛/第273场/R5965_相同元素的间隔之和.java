package LeetCode周赛.第273场;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/26 11:12
 * @Description:
 */

public class R5965_相同元素的间隔之和 {
    public static void main(String[] args) {
        R5965_相同元素的间隔之和 obj = new R5965_相同元素的间隔之和();
        obj.getDistances(new int[]{2,1,3,1,2,3,3});
    }

    public long[] getDistances(int[] arr) {
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
            int sum = get(list, arrCount[i]-1);
            ans.add(sum);
        }
        int len = ans.size();
        long[] res = new long[len];
        int index = 0;
        for (Integer an : ans) {
            res[index++] = an;
        }
        return res;
    }

    private int get(List<Integer> list, int ind) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += Math.abs(list.get(i) - list.get(ind));
        }
        return sum;
    }
}
