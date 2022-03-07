package 学习计划.高效制胜.Day06_数字;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/6 19:12
 * @Description:
 */

public class R0119_杨辉三角II {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 1; i < rowIndex + 1; ++i) {
            ans.add(0);
            for (int j = i; j >= 1; j--) {
                ans.set(j, ans.get(j) + ans.get(j - 1));
            }
        }
        return ans;
    }

}
