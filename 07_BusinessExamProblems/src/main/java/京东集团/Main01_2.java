package 京东集团; /**
 * @author Ren
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main01_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int[][] arr = new int[n][2];
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt(),b=in.nextInt();
            int t1 = a-b;
            int t2 = a+b;
            map1.put(t1,map1.getOrDefault(t1,0)+1);
            map2.put(t2,map2.getOrDefault(t2,0)+1);
        }

        Set<Integer> set1 = map1.keySet();
        Set<Integer> set2 = map2.keySet();
        int ans=0;
        for (Integer key : set1) {
            int t = map1.get(key);
            ans+= (t*(t-1))/2;
        }
        for (Integer key : set2) {
            int t = map2.get(key);
            ans+= (t*(t-1))/2;
        }
        System.out.println(ans);
    }
}
