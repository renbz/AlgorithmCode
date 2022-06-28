package 每日一题_2022_06月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/6/28 20:00
 * @Description:
 */

public class R06_28_0324_摆动排序II {

    public void wiggleSort(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int n = nums.length;
        int x = (n + 1) / 2;
        for (int i = 0, j = x - 1, k = n - 1; i < n; i += 2, j--, k--) {
            nums[i] = arr[j];
            if (i + 1 < n) {
                nums[i + 1] = arr[k];
            }
        }
    }

}
