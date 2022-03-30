package 学习计划.编程能力.编程能力入门.Day06_07_数组;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 18:10
 * @Description:
 */

public class R0566_重塑矩阵 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];
        int index = 0;
        for (int[] ints : mat)
            for (int anInt : ints)
                ans[index / c][index++ % c] = anInt;
        return ans;
    }

}
