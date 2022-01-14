package 学习计划.剑指Offer;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/13 17:00
 * @Description:
 */

public class R66_构建乘积数组 {
    public int[] constructArr(int[] a) {
        int len = a.length;
        if (len == 0) return new int[]{0};
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * a[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            ans[i] *= a[i + 1];
            a[i] *= a[i + 1];
        }
        return ans;
    }
}
