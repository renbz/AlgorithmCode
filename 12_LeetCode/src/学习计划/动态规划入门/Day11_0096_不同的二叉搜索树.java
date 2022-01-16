package 学习计划.动态规划入门;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/16 15:06
 * @Description:
 */

public class Day11_0096_不同的二叉搜索树 {

    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
