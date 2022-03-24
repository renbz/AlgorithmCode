package 学习计划.算法.算法基础.Day04_双指针;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/11 17:41
 * @Description:
 */

public class R0986_区间列表的交集 {

    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi) ans.add(new int[]{lo, hi});
            if (A[i][1] < B[j][1]) i++;
            else j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
