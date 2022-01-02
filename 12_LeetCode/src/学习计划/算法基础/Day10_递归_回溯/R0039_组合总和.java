package 学习计划.算法基础.Day10_递归_回溯;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/31 09:15
 * @Description:
 */

public class R0039_组合总和 {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> trace = new ArrayList<>();
        backtrace(candidates, target, 0, trace, 0);
        return res;
    }

    public void backtrace(int[] candidates, int target, int start, List<Integer> trace, int sum){
        if(sum == target){
            res.add(new ArrayList<Integer>(trace));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            // 避免重复
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(candidates[i] + sum <= target){
                trace.add(candidates[i]);
                backtrace(candidates, target, i + 1, trace, sum + candidates[i]);
                trace.remove(trace.size() - 1);
            }else{
                // 后面的 candidates[i] 都比当前大，不用试了
                break;
            }
        }
    }

}
