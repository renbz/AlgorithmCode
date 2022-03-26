package 每日一题_2022_03月;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/26 16:30
 * @Description:
 */

public class R03_26_0682_棒球比赛 {

    public int calPoints(String[] ops) {
        List<Integer> ans = new ArrayList<>();
        for (String op : ops) {
            int size = ans.size();
            if ("+".equals(op)) {
                ans.add(ans.get(size - 1) + ans.get(size - 2));
            } else if ("D".equals(op)) {
                ans.add(ans.get(size - 1) * 2);
            } else if ("C".equals(op)) {
                ans.remove(size - 1);
            } else {
                ans.add(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (Integer an : ans) {
            sum += an;
        }
        return sum;
    }

}
