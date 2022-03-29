package 每日一题_2022_03月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/28 14:31
 * @Description:
 */

public class R03_28_0693_交替位二进制数 {

    public boolean hasAlternatingBits(int n) {
        int last = 2;
        while (n > 0) {
            if (last == (n & 1)) return false;
            else {
                last = (n & 1);
                n = n >> 1;
            }
        }
        return true;
    }

}
