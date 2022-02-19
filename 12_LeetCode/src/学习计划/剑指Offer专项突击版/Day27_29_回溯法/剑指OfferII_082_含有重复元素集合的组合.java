package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/17 22:26
 * @Description:
 */

public class 剑指OfferII_082_含有重复元素集合的组合 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, n, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(int[] candidates, int n, int idx, int target, List<Integer> list, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = idx; i < n; i++) {
            if (candidates[i] > target) break;
            if (i > idx && candidates[i] == candidates[i - 1]) { //剪枝、避免重复
                // 因为前面那个同样的数已经经历过dfs，再拿同样的数dfs就会得到重复的答案
                continue;
            }
            list.add(candidates[i]);
            dfs(candidates, n, i + 1, target - candidates[i], list, ans);
            list.remove(list.size() - 1);
        }
    }

}
