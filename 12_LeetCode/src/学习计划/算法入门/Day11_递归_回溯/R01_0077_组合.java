package 学习计划.算法入门.Day11_递归_回溯;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren
 */

public class R01_0077_组合 {

    List<List<Integer>> ans = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> combine(int n, int k) {
        for (int i = 1; i <= n - k+1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = i; j < i + k; j++) list.add(j);
            if(set.add(list))  ans.add(list);

            for (int j = 0; j < k; j++) {
                List<Integer> list2 = new ArrayList<>(list);
                list2.remove(j);

                for (int l = i + k; l <= n; l++) {
                    List<Integer> list3 = new ArrayList<>(list2);
                    list3.add(l);
                    if(set.add(list3))  ans.add(list3);
                }

            }
        }
        return ans;
    }
}
