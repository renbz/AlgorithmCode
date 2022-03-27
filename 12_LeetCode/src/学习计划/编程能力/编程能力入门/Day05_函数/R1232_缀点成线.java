package 学习计划.编程能力.编程能力入门.Day05_函数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/27 14:59
 * @Description:
 */

public class R1232_缀点成线 {

    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[1][0] - coordinates[0][0];
        int y1 = coordinates[1][1] - coordinates[0][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x2 = coordinates[i][0] - coordinates[0][0];
            int y2 = coordinates[i][1] - coordinates[0][1];
            if (x1 * y2 != x2 * y1) {
                return false;
            }
        }
        return true;
    }

}
