package 学习计划.剑指Offer专项突击版.Day01_02_整数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/20 10:51
 * @Description:
 */

public class 剑指OfferII_003_前n个数字二进制中1的个数 {

    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n; i++) {
            String s = Integer.toBinaryString(i);
            int cnt = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)=='1') cnt++;
            }
            ans[i]=cnt;
        }
        return ans;
    }

}
