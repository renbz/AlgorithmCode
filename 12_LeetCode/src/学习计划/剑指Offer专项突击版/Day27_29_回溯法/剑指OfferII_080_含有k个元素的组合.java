package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/15 22:40
 * @Description:
 */

public class 剑指OfferII_080_含有k个元素的组合 {

    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return ans;
    }

    private void dfs(int cur, int n, int k) {
        if (temp.size() + (n - cur + 1) < k) return;
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // 考虑选择当前位置
        temp.add(cur);
        dfs(cur+1,n,k);
        // 不选择当前位置
        temp.remove(temp.size()-1);
        dfs(cur+1,n,k);
    }
}
