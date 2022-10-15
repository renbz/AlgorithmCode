package 每日一题_2022_10月;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/10/15 15:30
 * @Description:
 */

public class R10_15_1441_用栈操作构建数组 {
    public static final String PUSH = "Push";
    public static final String Pop = "Pop";

    public List<String> buildArray(int[] target, int n) {
        int num = 1;
        List<String> ans = new LinkedList<>();
        for (int i = 0; i < target.length; i++) {
            if (target[i] != num) {
                int t = target[i] - num;
                while (t-- > 0) {
                    ans.add(PUSH);
                    ans.add(Pop);
                }
                num=target[i];
            }
            ans.add(PUSH);
            num++;
        }
        return ans;
    }
}
