package 每日一题_2022_07月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/7/12 19:37
 * @Description:
 */

public class R07_12_1252_奇数值单元格的数目 {

    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (((rows[i] + cols[j]) & 1) != 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
