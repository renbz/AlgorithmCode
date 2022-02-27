package 学习计划.剑指Offer专项突击版.Day36_40_图;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/28 00:01
 * @Description:
 */

public class 剑指OfferII_110_所有路径 {

    List<List<Integer>> ans = new ArrayList<>();
    Deque<Integer> stack = new ArrayDeque<Integer>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        stack.offerLast(0);
        dfs(graph, 0, graph.length - 1);
        return ans;
    }

    private void dfs(int[][] graph, int x, int n) {
        if (x == n) {
            ans.add(new ArrayList<>(stack));
            return;
        }
        for (int y : graph[x]) {
            stack.offerLast(y);
            dfs(graph, y, n);
            stack.pollLast();
        }
    }

}
