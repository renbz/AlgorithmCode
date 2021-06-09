package R04_5月5号;

/**
 * @author Ren
 */

import java.util.*;
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            String str = in.next();
            char [] arr = str.toCharArray();
            Map<Character,Integer> map = new HashMap();
            for (int i = 0; i < arr.length; i++) {
                if(map.get(arr[i])==null){
                    map.put(arr[i],1);
                }else{
                    map.put(arr[i],(map.get(arr[i])+1));
                }
            }

            int res = 0;
            Set<Character> cset = map.keySet();
            for (Character c : cset) {
                res += sum(map.get(c));
            }
            System.out.println(res);

        }
    }

    // 求和1-n的方法
    public static int sum(int n){
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s+=i;
        }
        return s;
    }
}
