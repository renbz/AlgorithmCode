package 顺丰科技;

/**
 * @author Ren
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main02_旅行 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        Map<String, Integer> map = new HashMap<>(m);
        Map<Integer, Integer> map2 = new HashMap<>(n);

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            map2.put(a,1);
            map2.put(b,1);

            int min = a > b ? b : a;
            int max = a > b ? a : b;
            map2.put(max, min);
            StringBuilder builder = new StringBuilder();

            map.put(builder.append(min).append("-").append(max).toString(), c);
        }


        while (q-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();
            int min = a > b ? b : a;
            int max = a > b ? a : b;
            if (min == max) {
                System.out.println(0);
            } else {
                int res = Integer.MIN_VALUE;
                int k=-1;
                while (min!=max){
                    for (int i = max; i > min; i--) {
                        if(map2.get(i)==null) continue;
                        StringBuilder builder = new StringBuilder();
                        builder = builder.append(min).append("-").append(i);
                        if (map.get(builder.toString()) != null) {
                            int t = map.get(builder.toString());
                            res = res > t ? res : t;
                            min=i;
                            break;
                        }
                    }
                }
                System.out.println(res);
            }
        }
    }

}
