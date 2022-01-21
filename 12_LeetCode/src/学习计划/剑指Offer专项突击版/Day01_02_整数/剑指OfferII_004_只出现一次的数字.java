package 学习计划.剑指Offer专项突击版.Day01_02_整数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/21 09:18
 * @Description:
 */

public class 剑指OfferII_004_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int ans = 0;
        int cnt[] = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                cnt[i] += (num >> i) & 1;
            }
        }
        for (int i = 31; i >= 0; i--) {
            int t = cnt[i] % 3 == 0 ? 0 : 1;
            ans = (ans << 1) | t;
        }
        return ans;
    }
}
