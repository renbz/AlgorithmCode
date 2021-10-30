package 奇安信;

import java.util.Arrays;

/**
 * @author Ren
 */

public class Main02_断线连珠 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 得到短珠串的长度。【连三颗即成串，不必把所有珠子连起来】
     *
     * @param pearls int整型二维数组 n*2的二维数组，珠子的坐标，坐标值都为非负整数
     * @return int整型
     */
    public int getMinLength(int[][] pearls) {
        // write code here
        //Arrays.sort(pearls, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o1[0] - o2[0]);
        //Arrays.sort(pearls, (o1, o2) -> (o1[0]+o1[1]) - (o2[0]+o2[1]));
        Arrays.sort(pearls, (o1, o2) -> (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]));
        //三个一组寻找最小的区间  双指针 -> 滑动窗口
        int l = 0, r = 2, min = Integer.MAX_VALUE;
        while (r < pearls.length) {
            int d11 = pearls[r - 2][0];
            int d12 = pearls[r - 2][1];
            int d21 = pearls[r - 1][0];
            int d22 = pearls[r - 1][1];
            int d31 = pearls[r][0];
            int d32 = pearls[r][1];
            // A-B   A-C
            int l1 = Math.abs(d11 - d21) + Math.abs(d12 - d22) + Math.abs(d11 - d31) + Math.abs(d12 - d32);
            // A-B   B-C
            int l2 = Math.abs(d11 - d21) + Math.abs(d12 - d22) + Math.abs(d21 - d31) + Math.abs(d22 - d32);
            // A-C   B-C
            int l3 = Math.abs(d11 - d31) + Math.abs(d12 - d32) + Math.abs(d21 - d31) + Math.abs(d22 - d32);

            int temp = Math.min(l1, Math.min(l2, l3));
            min = temp < min ? temp : min;
            r++;
        }
        return min;
    }

}
