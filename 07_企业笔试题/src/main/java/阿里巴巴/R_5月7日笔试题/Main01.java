package 阿里巴巴.R_5月7日笔试题;

/**
 * @author Ren
 */

import java.util.*;
public class Main01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
            max = arr1[i]>max?arr1[i]:max;
        }
        long res = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = in.nextInt();
            if(arr2[i]<max){
                res += max-arr2[i];
            }
        }

        System.out.println(res);

    }

}
