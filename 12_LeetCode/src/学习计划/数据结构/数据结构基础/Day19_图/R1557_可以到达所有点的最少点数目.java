package 学习计划.数据结构.数据结构基础.Day19_图;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ren
 */

public class R1557_可以到达所有点的最少点数目 {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> InEdges = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < edges.size(); i++) InEdges.add(edges.get(i).get(1));
        for (int i = 0; i < n; i++) {
            if(!InEdges.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}
