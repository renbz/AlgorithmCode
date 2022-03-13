package 美团.R2022_03_12;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/12 17:19
 * @Description:
 */

import java.util.*;

public class Main004 {

    static int[] arr;
    static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = in.nextInt();
        }
        int ans = dfs(0, 0, 0);
        System.out.println(ans);
    }

    static int dfs(int point, int ans, int index) {
        if (m == index) return ans;
        if (arr[index] == point) {
            ans++;
            int ans1 = point < n ? dfs(point + 1, ans, index + 1) : Integer.MAX_VALUE;
            int ans2 = point > 0 ? dfs(point - 1, ans, index + 1) : Integer.MAX_VALUE;

            return Math.min(ans1, ans2);
        } else {
            return dfs(point++, ans, index++);
        }
    }
}
