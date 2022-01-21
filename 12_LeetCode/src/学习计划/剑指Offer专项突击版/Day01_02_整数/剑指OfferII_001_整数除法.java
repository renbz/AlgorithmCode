package 学习计划.剑指Offer专项突击版.Day01_02_整数;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/20 09:48
 * @Description:
 */

public class 剑指OfferII_001_整数除法 {

    public int divide(long a, long b) {
        long ans = 0;
        if (a == 0) return (int) ans;
        if(b==1) return (int)a;
        if(b==-1) {
            return  -(int)a==1 << 31 ? (1 << 31) - 1 : -(int)a;
        }

        if (a > 0 && b > 0) {
            while (a - b >= 0) {
                ans++;
                a = a - b;
            }
            ans = ans == 1 << 31 ? (1 << 31) - 1 : ans;
        } else if (a < 0 && b < 0) {
            while (a - b <= 0) {
                ans++;
                a = a - b;
            }
            ans = ans == 1 << 31 ? (1 << 31) - 1 : ans;
        } else if (a < 0 && b > 0) {
            while (a + b <= 0) {
                ans--;
                a = a + b;
            }
        } else {
            while (a + b >= 0) {
                ans--;
                a = a + b;
            }
        }
        return (int)ans ;
    }

    public int divide(int a, int b) {
        // 1、溢出
        if(a == Integer.MIN_VALUE && b == -1) return Integer.MAX_VALUE;
        // 2、确定最终结果正负号
        boolean negative = false;
        if((a < 0 && b > 0)||(a > 0 && b < 0)) negative = true;
        // 3、统一转成负数进行计算（最大的整数转为负数依然在范围内，相反如果把最小的负数转为正数就会溢出范围）
        if(a > 0) a = -a;
        if(b > 0) b = -b;
        // 4、用减法模拟除法
        int res = 0;
        while(a <= b){
            int t = b, cnt = 1;
            // 注意 a 不会小于 Integer.MIN_VALUE，因此 t 不会小于 Intege.MIN_VALUE 的一半，即 0xc0000000
            while(t >= 0xc0000000 && a <= t + t){
                t += t;
                cnt += cnt;
            }
            res += cnt;
            a -= t;
        }
        return negative ? -res : res;
    }

}
