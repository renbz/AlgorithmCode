package 学习计划.剑指Offer专项突击版.Day36_40_图;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/27 23:16
 * @Description:
 */

public class 剑指OfferII_106_二分图 {

    public boolean isBipartite(int[][] graph) {
        // 0未上色  1红色   2蓝色
        int len = graph.length;
        int[] color = new int[len];
        for (int i = 0; i < len; i++) {
            if (color[i] == 0) {
                if (!dfs(graph, color, i, 1)) return false;
            }
        }
        return true;
    }

    private boolean dfs(int[][] graph, int[] color, int i, int curColor) {
        color[i] = curColor;
        int subColor = curColor == 1 ? 2 : 1;
        for (int near : graph[i]) {
            if (color[near] == 0) {
                if (!dfs(graph, color, near, subColor)) return false;
            } else if (color[near] != subColor) return false;
        }
        return true;
    }

}
