package 每日一题_2022_01月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/1/21 21:03
 * @Description:
 */

public class R01_21_1345_跳跃游戏IV {

    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.putIfAbsent(arr[i], new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        Set<Integer> set = new HashSet<>();
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        set.add(0);
        while (!queue.isEmpty()) {
            int[] idxStep = queue.poll();
            int idx = idxStep[0], step = idxStep[1];
            if (idx == arr.length - 1) return step;
            int v = arr[idx];
            step++;
            if (map.containsKey(v)) {
                for (int i : map.get(v)) {
                    if (set.add(i)) queue.offer(new int[]{i, step});
                }
                map.remove(v);
            }
            if (idx + 1 < arr.length && set.add(idx + 1)) queue.offer(new int[]{idx + 1, step});
            if (idx - 1 >= 0 && set.add(idx - 1)) queue.offer(new int[]{idx - 1, step});
        }
        return -1;
    }

}
