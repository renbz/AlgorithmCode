package 每日一题_2022_06月;

import java.util.Random;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/5 22:06
 * @Description:
 */

public class R06_05_0478_在圆内随机生成点 {

    class Solution {

        Random random;
        double xc, yc, r;

        public Solution(double radius, double x_center, double y_center) {
            random = new Random();
            xc = x_center;
            yc = y_center;
            r = radius;
        }

        public double[] randPoint() {
            while (true) {
                double x = random.nextDouble() * (2 * r) - r;
                double y = random.nextDouble() * (2 * r) - r;
                if (x * x + y * y <= r * r) {
                    return new double[]{xc + x, yc + y};
                }
            }
        }
    }

}
