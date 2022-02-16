package 学习计划.剑指Offer专项突击版.Day27_29_回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/15 12:44
 * @Description:
 */

public class 剑指OfferII_079_所有子集 {

    public List<List<Integer>> subsets(int[] nums) {
        // bfs 遍历数组，将之前出现的所有可能序列，加上当前数字组成新序列
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        for (int num : nums) {
            int size = ans.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> newList = new ArrayList<>(ans.get(i));
                newList.add(num);
                ans.add(newList);
            }
        }
        return ans;
    }

}
