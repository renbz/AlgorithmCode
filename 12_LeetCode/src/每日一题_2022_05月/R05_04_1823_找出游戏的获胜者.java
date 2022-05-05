package 每日一题_2022_05月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/5/4 17:51
 * @Description:
 */

public class R05_04_1823_找出游戏的获胜者 {

    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int idx = 0;
        while (n > 1) {
            idx = (idx + k - 1) % n;
            list.remove(idx);
            n--;
        }
        return list.get(0) + 1;
    }

}
