package 每日一题_2022_08月;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/8/22 22:45
 * @Description:
 */

public class R08_12_1282_用户分组 {

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> groups = new HashMap<Integer, List<Integer>>();
        int n = groupSizes.length;
        for (int i = 0; i < n; i++) {
            int size = groupSizes[i];
            groups.putIfAbsent(size, new ArrayList<Integer>());
            groups.get(size).add(i);
        }
        List<List<Integer>> groupList = new ArrayList<List<Integer>>();
        for (Map.Entry<Integer, List<Integer>> entry : groups.entrySet()) {
            int size = entry.getKey();
            List<Integer> people = entry.getValue();
            int groupCount = people.size() / size;
            for (int i = 0; i < groupCount; i++) {
                List<Integer> group = new ArrayList<Integer>();
                int start = i * size;
                for (int j = 0; j < size; j++) {
                    group.add(people.get(start + j));
                }
                groupList.add(group);
            }
        }
        return groupList;
    }

}
