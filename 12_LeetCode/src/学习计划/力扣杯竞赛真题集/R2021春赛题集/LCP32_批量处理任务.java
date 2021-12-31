package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 12:57
 * @Description:
 */

public class LCP32_批量处理任务 {
    class Pair {
        public int slots;
        public int index;

        public Pair(int slots, int index) {
            this.slots = slots;
            this.index = index;
        }
    }

    class PairComparator implements Comparator<Pair> {
        @Override
        public int compare(Pair p1, Pair p2) {
            if (p1.slots > p2.slots || (p1.slots == p2.slots && p1.index > p2.index)) {
                return 1;
            } else if (p1.slots < p2.slots || p1.index < p2.index) {
                return -1;
            }
            return 0;
        }
    }

    class Solution {
        public int processTasks(int[][] tasks) {
            int n = tasks.length;
            Set<Integer> ts = new TreeSet<Integer>();
            for (int[] task : tasks) {
                ts.add(task[0]);
                ts.add(task[1] + 1);
            }
            ArrayList<Integer> vt = new ArrayList<>(ts);
            int m = vt.size();
            Map<Integer,Integer> mp = new HashMap<Integer, Integer>(m);
            for (int i = 0; i < m; ++i) {
                mp.put(vt.get(i), i);
            }

            List<ArrayList<Integer>> starts = Stream.generate(ArrayList<Integer>::new)
                    .limit(m)
                    .collect(Collectors.toList());
            for (int i = 0; i < n; ++i) {
                starts.get(mp.get(tasks[i][0])).add(i);
            }

            int ans = 0;
            int extra = 0;
            PriorityQueue<Pair> pq = new PriorityQueue<Pair>(n, new PairComparator());

            for (int i = 0; i < m - 1; ++i) {
                while (!pq.isEmpty() && tasks[pq.peek().index][1] < vt.get(i)) {
                    pq.poll();
                }

                for (int u : starts.get(i)) {
                    pq.add(new Pair(extra + tasks[u][1] - vt.get(i) + 1 - tasks[u][2], u));
                }

                int currentSeg = vt.get(i + 1) - vt.get(i);
                if (!pq.isEmpty()) {
                    int minSlots = pq.peek().slots - extra;
                    int slotsToDel = currentSeg;

                    if (minSlots < currentSeg) {
                        int delta = currentSeg - minSlots;
                        ans += delta;
                        slotsToDel -= delta;
                    }

                    extra += slotsToDel;
                }
            }

            return ans;
        }
    }
}
