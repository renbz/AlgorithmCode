package 学习计划.算法.算法基础.Day08_广度_深度优先搜索;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/12 11:42
 * @Description:
 */

public class R1091_二进制矩阵中的最短路径 {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] temp = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return -1;
        if (n == 1 && grid[0][0] == 0) return 1;
        Queue<List<int[]>> queue = new LinkedList();
        List<int[]> list = new ArrayList();
        list.add(new int[]{0, 0});
        queue.offer(list);
        grid[0][0] = 1;
        int ans = 1;
        while (!queue.isEmpty()){
            List<int[]> curList = new ArrayList();
            list = new ArrayList(queue.poll());
            for(int[] arr : list){
                for(int i = 0; i < 8; i++){
                    int curI = arr[0] + temp[i][0];
                    int curJ = arr[1] + temp[i][1];
                    if(curI == n - 1 && curJ == n - 1) return ++ans;
                    if(0 <= curI && curI < n && 0 <= curJ && curJ < n && grid[curI][curJ] == 0){
                        curList.add(new int[]{curI, curJ});
                        grid[curI][curJ] = 1;
                    }
                }
            }
            if(curList.size() > 0){
                queue.add(curList);
                ans++;
            }
        }
        return -1;

    }

}
