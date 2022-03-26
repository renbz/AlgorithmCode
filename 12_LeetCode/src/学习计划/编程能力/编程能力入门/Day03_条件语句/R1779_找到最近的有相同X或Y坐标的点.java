package 学习计划.编程能力.编程能力入门.Day03_条件语句;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/25 10:30
 * @Description:
 */

public class R1779_找到最近的有相同X或Y坐标的点 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = Integer.MAX_VALUE, ans = -1;
        for (int i = 0; i < points.length; i++) {
            if ((points[i][0] == x || points[i][1] == y)) {
                if (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]) < min) {
                    min = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                    ans = i;
                }
            }
        }
        return ans;
    }

}