package 每日一题_2021_12月;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 09:15
 * @Description:
 */

public class R12_30_0846_一手顺子 {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>((o1, o2) -> o1-o2);
        for (int i : hand) {
            map.put(i,map.getOrDefault(i,0)+1);
            heap.add(i);
        }
        while (!heap.isEmpty()){
            int t = heap.poll();
            if(map.get(t)==0) continue;
            for (int i = 0; i < groupSize; i++) {
                int count = map.getOrDefault(t+i,0);
                if(count==0) return false;
                map.put(t+i,count-1);
            }
        }
        return true;
    }

}
