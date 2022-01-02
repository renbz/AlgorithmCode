package 每日一题_2022_01月;

import com.sun.org.apache.regexp.internal.RE;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 10:07
 * @Description:
 */

public class R01_02_0390_消除游戏 {

    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (n / 2 + 1 - lastRemaining(n / 2));
    }


    public int lastRemaining2(int n) {
        int a1 = 1, an = n, k = 0, cnt = n, step = 1;
        while (cnt > 1) {
            if (k % 2 == 0) a1 = a1 + step; //正向
            else a1 = (cnt % 2 == 0) ? a1 : a1 + step; // 反向
            k++;
            cnt >>= 1;
            step <<= 1;
        }
        return a1;
    }
}
