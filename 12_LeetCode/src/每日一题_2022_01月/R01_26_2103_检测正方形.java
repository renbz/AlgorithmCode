package 每日一题_2022_01月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/26 09:28
 * @Description:
 */

public class R01_26_2103_检测正方形 {

    class DetectSquares {
        int count[][];//记录坐标点为ij的数目
        public DetectSquares() {
            count = new int[1005][1005];
        }
        public void add(int[] point) {
            count[point[0]][point[1]]++;
        }
        public int count(int[] point) {
            int ans = 0;
            int a = point[0] + point[1];//对角线斜率为-1的时候坐标和
            int b = point[0] - point[1];//对角线斜率为1的时候x-y
            for (int i = 0; i <= 1000; i++) {
                if (i == point[0]) continue;//xi坐标是i,和point重复
                // y1、y2 为了找出对应的正方形的其他的点
                int y1 = a - i;
                int y2 = i - b;
                if (y1 >= 0 && y1 <= 1000) ans += count[point[0]][y1] * count[i][point[1]] * count[i][y1];
                if (y2 >= 0 && y2 <= 1000) ans += count[point[0]][y2] * count[i][point[1]] * count[i][y2];
            }
            return ans;
        }
    }

}
