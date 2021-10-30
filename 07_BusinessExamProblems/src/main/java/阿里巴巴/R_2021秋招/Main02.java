package 阿里巴巴.R_2021秋招;

/**
 * @author Ren
 */

import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //部队数量
        int m = in.nextInt();  // 询问次数
        int[][] ques = new int[m][3];  //询问
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i + 1, in.nextInt());
        }
        Set<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int t = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            //结盟
            if (t == 1) {
                if (a != b) {
                    int t1 = Math.min(a, b);
                    int t2 = Math.max(a, b);
                    String s = t1 + "-" + t2;
                    if (!set.contains(s)) {
                        set.add(s);
                        System.out.println((a + b) ^ (Math.abs(map.get(a) - map.get(b))));
                        map.put(t2, map.get(t1));
                    }
                }
            }
            if (t == 2) {
                int t1 = Math.min(a, b);
                int t2 = Math.max(a, b);
                String s = t1 + "-" + t2;
                if (set.contains(s)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

}
