package 每日一题_2022_01月;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/31 00:22
 * @Description:
 */

public class R01_31_1342_将数字变成0的操作次数 {

    public int numberOfSteps(int num) {
        int ans = 0;
        while (num > 0) {
            if ((num & 1) == 1) ans++;
            num >>= 1;
            if (num > 0) ans++;
        }
        return ans;
    }

}
