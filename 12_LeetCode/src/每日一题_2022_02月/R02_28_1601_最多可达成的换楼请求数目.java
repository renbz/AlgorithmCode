package 每日一题_2022_02月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/28 00:15
 * @Description:
 */

public class R02_28_1601_最多可达成的换楼请求数目 {

    public int maximumRequests(int n, int[][] requests) {
        int[] delate = new int[n];
        int ans = 0, m = requests.length;
        for (int mask = 0; mask < (1 << m); mask++) {
            int cnt = Integer.bitCount(mask);
            if (cnt <= ans) continue;
            Arrays.fill(delate, 0);
            for (int i = 0; i < m; i++) {
                if ((mask & (1 << i)) != 0) {
                    delate[requests[i][0]]++;
                    delate[requests[i][1]]--;
                }
            }
            boolean flag = true;
            for (int x : delate) {
                if (x != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) ans = cnt;
        }
        return ans;
    }

}
