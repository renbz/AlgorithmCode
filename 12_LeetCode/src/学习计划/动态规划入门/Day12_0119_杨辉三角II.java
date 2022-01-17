package 学习计划.动态规划入门;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/16 22:45
 * @Description:
 */

public class Day12_0119_杨辉三角II {

    public List<Integer> generate(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 1; i < rowIndex; ++i) {
            ans.add(0);
            for (int j = i; j >= 1; j--) {
                ans.set(j, ans.get(j) + ans.get(j - 1));
            }
        }
        return ans;
    }

}
