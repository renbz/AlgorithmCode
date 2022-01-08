package 每日一题_2022_01月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/8 11:55
 * @Description:
 */

public class R01_08_0089_格雷编码 {

    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = 0; i < n; i++) {
            int num = 1 << i;
            for (int j = ans.size() - 1; j >= 0; j--) {
                ans.add(num | ans.get(j));
            }
        }
        return ans;
    }

}
