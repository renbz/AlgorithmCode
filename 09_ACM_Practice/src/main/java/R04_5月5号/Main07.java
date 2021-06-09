package R04_5月5号;

/**
 * @author Ren
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            int n = in.nextInt();
            int [] arr = new int[n];
            Set<Integer> set = new HashSet();
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                set.add(arr[i]);
                max = arr[i]>max?arr[i]:max;
                min = arr[i]<min?arr[i]:min;
            }

            if(set.size()>=3){
                System.out.println(-1);
            }else{
                System.out.println(max-min);
            }

        }
    }
}

