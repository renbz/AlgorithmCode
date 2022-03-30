package 每日一题_2022_03月;

import java.util.*;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2022/3/30 17:58
 * @Description:
 */

public class R03_30_1606_找到处理最多请求的服务器 {

    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> avaliable = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            avaliable.add(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] requests = new int[k];
        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                avaliable.add(busy.poll()[1]);
            }
            if (avaliable.isEmpty()) continue;
            Integer p = avaliable.ceiling(i % k);
            if (p == null) p = avaliable.first();
            requests[p]++;
            busy.offer(new int[]{arrival[i] + load[i], p});
            avaliable.remove(p);
        }
        int maxRequest = Arrays.stream(requests).max().getAsInt();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (requests[i] == maxRequest) ans.add(i);
        }
        return ans;
    }

}
