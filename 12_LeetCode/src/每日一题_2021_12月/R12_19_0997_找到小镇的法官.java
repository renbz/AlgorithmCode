package 每日一题_2021_12月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/19 13:42
 * @Description:
 */

public class R12_19_0997_找到小镇的法官 {

    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust) {
            int x = edge[0], y = edge[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
