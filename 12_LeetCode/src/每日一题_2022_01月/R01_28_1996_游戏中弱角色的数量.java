package 每日一题_2022_01月;

import java.util.Arrays;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/28 09:23
 * @Description:
 */

public class R01_28_1996_游戏中弱角色的数量 {

    public int numberOfWeakCharacters(int[][] properties) {
        // 根据攻击值降序，防御值升序排列
        Arrays.sort(properties, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        int maxDef = 0, ans = 0;
        for (int[] property : properties) {
            if (property[1] < maxDef) {
                ans++;
            } else {
                maxDef = property[1];
            }
        }
        return ans;
    }

}
