package 奇安信;

import java.util.Arrays;

/**
 * @author Ren
 */

public class Main01_最近真分数2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 得到最接近的真分数
     *
     * @param m float浮点型 (0.01,0.99)区间内的一个小数
     * @return int整型一维数组
     */
    public int[] getFraction(float m) {
        int n = 200, i = 0, j = 0, a = 1, b = 1;
        double x = m, d = 0, t = 100;
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                d = Math.abs((double) j / (double) i - x);
                if (d <= t) {
                    t = d;
                    a = i;
                    b = j;
                }
            }
        }

        int gcd = gcd(a,b);
        a = a/gcd;
        b = b/gcd;
        return new int[]{b,a};

    }

    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Main01_最近真分数2 obj = new Main01_最近真分数2();
        int[] aa = obj.getFraction((float) 0.1415926535898);
        System.out.println(Arrays.toString(aa));

    }


}
