package 每日一题_2021_12月;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/7 22:02
 * @Description:
 */

public class R12_07_1034_边界着色 {

    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        int rowLength = grid.length;
        int colLength = grid[0].length;
        int[][] ans = new int[rowLength][colLength];
        // 使用数组表示 坐标四个方向的变换
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        // 定义一个队列,首先将起始坐标放入队列
        Queue<int[]> dequeue = new ArrayDeque<>();
        dequeue.add(new int[]{row, col});
        // 开始遍历队列
        while (!dequeue.isEmpty()) {
            /**
             * 因为是双向队列 所以首尾都能取值，这里从头部取值
             */
            int[] poll = dequeue.poll();
            int x = poll[0], y = poll[1], count = 0;
            //对当前坐标的四个方向进行遍历
            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx < 0 || nx >= rowLength || ny < 0 || ny >= colLength) continue;
                if (grid[x][y] != grid[nx][ny]) {
                    //格子颜色和起始格子颜色不一样
                    continue;
                } else {
                    //格子颜色和起始格子颜色一样
                    count++;
                }
                if (ans[nx][ny] != 0) {
                    //判断该格子是否被处理过了~因为初始化ans数组时默认值是0表示未被处理！
                    continue;
                }
                //都不是以上情况，即可将新格子坐标加入队列~
                //理论上加入到双向队列中的格子坐标对应的颜色都是和起始格子颜色一样的！
                dequeue.add(new int[]{nx, ny});
            }
            //count = 4 说明 取出来的新格子 对应的四个方向格子和起始格子颜色都是一样的~
            //说明对应该格子不是边界格！则将原有颜色赋值给ans矩阵~否则就根据color进行赋值！
            ans[x][y] = count == 4 ? grid[x][y] : color;
        }
        /**
         * 避免格子没有完全遍历到，因为可能在较大矩阵中，起始格子的边界较小则不会遍历到所有格子~
         * 则要给没有遍历到的格子赋值（将原来的颜色赋值）
         */
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                if (ans[i][j] == 0) {
                    ans[i][j] = grid[i][j];
                }
            }
        }
        return ans;
    }
}
