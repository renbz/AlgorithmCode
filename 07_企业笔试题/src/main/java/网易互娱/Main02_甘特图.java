package 网易互娱;

/**
 * @author Ren
 */

import java.util.*;

public class Main02_甘特图 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            // N项任务
            int n = in.nextInt();
            // 存储完成第 i+1 项任务需要的时间
            int[] ans = new int[n];
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int tt = 0; tt < n; tt++) {

                int di = in.nextInt();
                int ki = in.nextInt();
                int[] M = new int[ki];
                for (int i = 0; i < ki; i++) {
                    M[i] = in.nextInt();
                }
                ans[tt] = di;
                if (ki != 0) {
                    Set<Integer> set = new HashSet<>();
                    int mmax = -1;
                    for (int i = 0; i < ki; i++) {
                        //找出ans中最大的一个
                        mmax = mmax>ans[M[i]-1]?mmax:ans[M[i]-1];
                        //ans[tt] += ans[M[i] - 1];
                    }
                    ans[tt] += mmax;
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < ans.length; i++) {
                max = max > ans[i] ? max : ans[i];
            }
            System.out.println(max);
        }
    }
}
