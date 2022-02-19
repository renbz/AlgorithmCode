package 每日一题_2022_02月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/2/19 16:14
 * @Description:
 */

public class R02_19_0969_煎饼排序 {

    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int n = arr.length; n > 1; n--) {
            int index = 0;
            for (int i = 1; i < n; i++) {
                if (arr[i] >= arr[index]) index = i;
            }
            if (index == n - 1) continue;
            reverse(arr, index);
            reverse(arr, n - 1);
            ans.add(index + 1);
            ans.add(n);
        }
        return ans;
    }

    public void reverse(int[] arr, int end) {
        for (int i = 0, j = end; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
