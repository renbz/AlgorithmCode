package R04_5月5号;

/**
 * @author Ren
 */

import java.util.Scanner;


public class Main07_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while (k-- >0){
            int n = in.nextInt();
            long [] arr = new long[ n];
            long max = Long.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                max = arr[i]>max?arr[i]:max;
            }
            long [] arr2 = arr;
            long sum2 = 0;
            for (int i = 0; i < arr2.length; i++) {
                arr2[i]-=max;
                sum2+=arr2[i];
            }

            if(Math.abs(sum2)<=max){
                System.out.println(Math.abs(sum2));
            }else{
                System.out.println(-1);
            }
        }
    }
}

