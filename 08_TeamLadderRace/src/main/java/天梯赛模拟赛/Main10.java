package 天梯赛模拟赛;

/**
 * @author Ren
 */

import java.util.*;

public class Main10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int b = in.nextInt();

        int [] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=in.nextInt();
        }

        int count=0;
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < k; j++) {
                if(k+arr[i]>arr[j] && k+arr[j]>arr[i]  && arr[i]+arr[j]>k){
                    count++;
                }
            }
        }

        System.out.println(count);


    }
}
