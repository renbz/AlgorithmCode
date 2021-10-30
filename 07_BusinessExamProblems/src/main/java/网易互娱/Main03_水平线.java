package 网易互娱;

/**
 * @author Ren
 */

import java.util.*;

public class Main03_水平线 {

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

                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < M.length; i++) {
                    list.add(M[i]);
                }
                map.put(tt, list);
                ans[tt] = di;
                if (ki != 0) {
                    Set<Integer> set = new HashSet<>();
                    for (int i = 0; i < ki; i++) {
                        // 对于M[i]
                        int be = set.size();
                        List<Integer> l = map.get(i);
                        for (int j = 0; j < map.get(i).size(); j++) {
                            int kk = l.get(j);
                            set.add(kk);
                            //ans[tt] += ans[kk];
                        }
                        int af = set.size();
                        int mmax = -1;
                        if (af > be) ans[tt] += ans[M[i] - 1];
                        mmax = mmax > di ? mmax : di;
                        ans[tt] += mmax;
                    }


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
