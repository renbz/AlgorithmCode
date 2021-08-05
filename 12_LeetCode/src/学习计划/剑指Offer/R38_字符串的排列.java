package 学习计划.剑指Offer;

import java.util.*;

/**
 * @author Ren
 */

public class R38_字符串的排列 {


    Set<String> set = new HashSet<>();
    static int n;

    public String[] permutation(String s) {
        n = s.length();
        char[] arr = s.toCharArray();
        f(arr, 0);

        int size = set.size();
        String[] ans = new String[size];
        int index = 0;
        for (String str : set) {
            ans[index++] = str.toString();
        }

        return ans;
    }

    public void f(char[] arr, int k) {
        if (k >= n) {
            StringBuilder builder = new StringBuilder(n);
            for (int i = 0; i < n; i++) builder.append(arr[i]);
            set.add(builder.toString());
            return;
        }
        for (int i = k; i < n; i++) {
            char t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
            f(arr, k + 1);
            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }


}
