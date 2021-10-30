package 好未来.秋招2017_01;

/**
 * @author Ren
 */

import java.util.*;
public class R02_n个数里最小的k个 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] ans = str.split(" ");
        int k = Integer.parseInt(ans[ans.length - 1]);
        int n = ans.length - 1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(n);
        for (int i = 0; i < n; i++) {
            minHeap.add(Integer.parseInt(ans[i]));
        }

        for (int i = 0; i < k; i++) {
            System.out.print(i==k-1?minHeap.poll():minHeap.poll()+" ");
        }
    }
}
