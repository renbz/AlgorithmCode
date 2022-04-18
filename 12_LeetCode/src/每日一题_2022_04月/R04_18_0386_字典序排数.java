package 每日一题_2022_04月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/4/18 16:21
 * @Description:
 */

public class R04_18_0386_字典序排数 {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 1;
        for (int i = 0; i < n; i++) {
            ans.add(num);
            if (num * 10 <= n) {
                num *= 10;
            } else {
                while (num % 10 == 9 || num + 1 > n) {
                    num /= 10;
                }
                num++;
            }
        }
        return ans;
    }

}
