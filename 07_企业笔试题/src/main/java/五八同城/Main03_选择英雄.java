package 五八同城;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ren
 */

public class Main03_选择英雄 {

    public static void main(String[] args) {
        Main03_选择英雄 obj = new Main03_选择英雄();
        int teams = obj.getTeams(new int[]{1,3,2,4,0,0});
        System.out.println(teams);
    }

    public int getTeams(int[] heros) {
        // write code here
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < heros.length; i++) {
            map.put(heros[i], map.getOrDefault(heros[i], 0) + 1);
        }
        Set<Integer> set = map.keySet();
        if (set.size()<5) return 0;
        int res = 1;
        for (int i = 0; i < set.size(); i++) {
            res *= map.get(i);
        }
        return res;
    }
}
