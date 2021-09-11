package 学习计划.算法入门.Day09_广度_深度优先搜索;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Ren
 */

public class R02_0994_腐烂的橘子 {

    public static void main(String[] args) {
        R02_0994_腐烂的橘子 obj = new R02_0994_腐烂的橘子();
        obj.orangesRotting(new int[][]{{1,2}});

    }

    Queue<int[]> queue = new LinkedList<>();
    int minter = 0;
    int[][] grid;
    public int orangesRotting(int[][] grid) {

        this.grid = grid;
        /**
         * 值 0 代表空单元格；
         * 值 1 代表新鲜橘子；
         * 值 2 代表腐烂的橘子。
         */

        if(isGood()) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        bfs();
        if(isGood())return minter-1;
        else return -1;


    }

    public void bfs(){
        int size = queue.size();
        if (size>0) minter++;
        if (size==0) return;
        while (size-- >0){
            int[] t = queue.poll();
            int i= t[0],j=t[1];
            if(i-1>=0 && grid[i-1][j]==1){
                grid[i-1][j]=2;
                queue.offer(new int[]{i-1,j});
            }
            if(j-1>=0 && grid[i][j-1]==1){
                grid[i][j-1]=2;
                queue.offer(new int[]{i,j-1});
            }
            if(i+1<grid.length && grid[i+1][j]==1){
                grid[i+1][j]=2;
                queue.offer(new int[]{i+1,j});
            }
            if(j+1<grid[0].length && grid[i][j+1]==1){
                grid[i][j+1]=2;
                queue.offer(new int[]{i,j+1});
            }
        }
        bfs();
    }

    boolean isGood(){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1) return false;
            }
        }
        return true;
    }

}
