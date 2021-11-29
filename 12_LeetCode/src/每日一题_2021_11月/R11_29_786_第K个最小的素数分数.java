package 每日一题_2021_11月;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/11/29 09:28
 * @Description:
 */

public class R11_29_786_第K个最小的素数分数 {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        List<int[]> frac = new ArrayList<int[]>();
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                frac.add(new int[]{arr[i], arr[j]});
            }
        }
        Collections.sort(frac,(x,y)->x[0]*y[1]-y[0]*x[1]);
        return frac.get(k-1);
    }
}
