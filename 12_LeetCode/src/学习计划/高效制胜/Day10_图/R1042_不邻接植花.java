package 学习计划.高效制胜.Day10_图;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/13 15:31
 * @Description:
 */

public class R1042_不邻接植花 {

    public int[] gardenNoAdj(int n, int[][] paths) {
        /**
         * 限制每个节点的度为3，同时提供4种颜色，因此不需要回溯
         * 初始化节点，使用map保存节点与其临界点的关系
         * 第一版采用内部类构建
         */
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new HashSet<>());
        }
        // 初始化路径
        for (int[] path : paths) {
            int a = path[0] - 1;
            int b = path[1] - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            boolean[] used = new boolean[5];
            // 查看当前节点的所有临界点的色彩
            for (Integer adj : graph.get(i)) {
                used[res[adj]] = true;
            }
            // 为当前节点染色
            for (int j = 1; j <= 4; j++) {
                if (!used[j]) res[i] = j;
            }
        }
        return res;
    }

}
