package 学习计划.算法.算法基础.Day06_广度_深度优先搜索;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 22:26
 * @Description:
 */

public class R0547_省份数量 {

    public int findCircleNum(int[][] isConnected) {
        // int[][] isConnected 是无向图的邻接矩阵，n 为无向图的顶点数量
        int n = isConnected.length;
        // 定义boolean数组标识顶点是否被访问过
        boolean[] visited = new boolean[n];
        // 定义count来累计遍历过的连通域数量
        int count = 0;
        for (int i = 0; i < n; i++) {
            // 若当前顶点未被访问,说明又是一个新的连通域，则遍历新的连通域且count++
            if (!visited[i]) {
                count++;
                dfs(i, isConnected, visited);
            }
        }
        return count;
    }

    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        // 对顶点i进行标记
        visited[i] = true;
        // 继续遍历与i顶点相邻的顶点(使用visited数组防止重复访问)
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[i][j] == 1 && !visited[j]) {
                dfs(j, isConnected, visited);
            }
        }
    }

}
