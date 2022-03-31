package 每日一题_2022_03月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/31 16:17
 * @Description:
 */

public class R03_31_0728_自除数 {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    public boolean isSelfDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
