package 学习计划.编程能力.编程能力入门.Day03_条件语句;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/25 10:01
 * @Description:
 */

public class R0976_三角形的最大周长 {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; --i) {
            if (A[i - 2] + A[i - 1] > A[i]) {
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

}
