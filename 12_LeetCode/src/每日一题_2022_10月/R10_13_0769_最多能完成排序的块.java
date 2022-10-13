package 每日一题_2022_10月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/13 18:44
 * @Description:
 */

public class R10_13_0769_最多能完成排序的块 {

    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int m = 0;
        for (int i = 0; i < arr.length; i++) {
            m = Math.max(m, arr[i]);
            if (m == i) {
                ans++;
            }
        }
        return ans;
    }

}
