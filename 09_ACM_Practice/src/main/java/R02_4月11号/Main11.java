package R02_4月11号;

import java.util.*;

/**
 * @author Ren
 */

public class Main11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int sum = m;
        int k = in.nextInt();
        int [] arr = new int[k];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < k; i++) {
            int t = in.nextInt();
            int tt = in.nextInt();
            arr[i]=t;
            map.put(t,tt);
        }

        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            if(sum>arr[i]){
                sum+=map.get(arr[i]);
            }else{
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");

    }

}
