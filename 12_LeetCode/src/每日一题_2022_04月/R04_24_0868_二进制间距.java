package 每日一题_2022_04月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/24 19:00
 * @Description:
 */

public class R04_24_0868_二进制间距 {

    public int binaryGap(int n) {
        int last = -1, ans = 0;
        for (int i = 0; n != 0; i++) {
            if ((n & 1) == 1) {
                if (last != -1) ans = Math.max(ans, i - last);
                last = i;
            }
            n >>= 1;
        }
        return ans;
    }

}
