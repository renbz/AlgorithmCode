package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/15 22:45
 * @Description:
 */

public class 剑指OfferII_081_允许重复选择元素的组合 {

    List<List<Integer>> ans = new ArrayList<>();
    int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        dfs(0, target, new ArrayList<>());
        return ans;
    }

    void dfs(int begin, int target, List<Integer> arr) {
        if (target == 0) ans.add(new ArrayList<>(arr));
        if (target < 0) return;
        for (int i = begin; i < candidates.length; i++) {
            arr.add(candidates[i]);
            dfs(i, target - candidates[i], arr);
            arr.remove(arr.size() - 1);
        }
    }
}
