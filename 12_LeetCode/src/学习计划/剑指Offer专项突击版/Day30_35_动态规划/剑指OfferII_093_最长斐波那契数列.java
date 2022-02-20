package 学习计划.剑指Offer专项突击版.Day30_35_动态规划;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/20 12:00
 * @Description:
 */

public class 剑指OfferII_093_最长斐波那契数列 {

    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] f = new int[n][n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int l = 0, r = i - 1;
            while (l < r) {
                int sum = arr[l] + arr[r];
                if (sum == arr[i]) {
                    f[r][i] = f[l][r] + 1;
                    // 这里+2是因为补上子序列前两位元素的长度，也可以在一开始把f初始化为2，这样就不需要+2了
                    max = Math.max(max, f[r][i] + 2);
                    l++;
                    r--;
                } else if (sum > arr[i]) r--;
                else l++;
            }
        }
        return max;
    }
}
