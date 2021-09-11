package 学习计划.算法入门.Day11_递归_回溯;

import java.util.*;

/**
 * @author Ren
 */

public class R02_0046_全排列 {

    List<List<Integer>> ans = new ArrayList<>();
    int[] arr;
    int len;
    public List<List<Integer>> permute(int[] nums) {
        arr = nums;
        len = nums.length;
        f(0);
        return ans;
    }
    void f(int k) {
        if (k == len) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) list.add(arr[i]);
            ans.add(list);
        }
        for (int i = k; i < len; i++) {
            int t = arr[k]; arr[k] = arr[i]; arr[i] = t;
            f(k + 1);
            t = arr[k]; arr[k] = arr[i]; arr[i] = t;
        }
    }
}
