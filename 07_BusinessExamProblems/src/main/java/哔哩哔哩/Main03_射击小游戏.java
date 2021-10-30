package 哔哩哔哩;

/**
 * @author Ren
 */

import java.util.*;
public class Main03_射击小游戏 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        Map<Integer,Integer> map = new HashMap<>();
        int max = -1,t=0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            if(a!=b){
                map.put(a,map.getOrDefault(a,0)+1);
                map.put(b,map.getOrDefault(b,0)+1);
            }else{
                map.put(b,map.getOrDefault(b,0)+1);
                t++;
            }
        }
        //遍历
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int v = entry.getValue();
            max = max>v?max:v;
        }
        System.out.println(max>t?max:t);

    }

}
