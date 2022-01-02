package LeetCode周赛.第274场;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/2 11:09
 * @Description:
 */

public class R5970_参加会议的最多员工数 {

    public int maximumInvitations(int[] favorite) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> mapIndex = new HashMap<>();
        int ans = favorite.length;
        for (int i = 0; i < favorite.length; i++) {
            map.put(favorite[i], map.getOrDefault(favorite[i], 0) + 1);
            mapIndex.put(i, favorite[i]);
        }
        int cnt = 0, last = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            int k = integerIntegerEntry.getKey();
            int v = integerIntegerEntry.getValue();
            if (v > 2) ans -= v - 2;
            if (v == 2) {
                //索引不同
                int t = mapIndex.get(k);
                int tt = map.get(t);
                if (t != tt) ans--;
            }
            if (v >= 2) {
                if (last == 2) cnt++;
                last = 2;
            } else {
                last = 0;
                cnt = 0;
            }
            // 减去连续的值
            ans -= cnt;
        }
        return ans;
    }

}
