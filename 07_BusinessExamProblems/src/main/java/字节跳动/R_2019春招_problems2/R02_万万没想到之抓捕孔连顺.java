package 字节跳动.R_2019春招_problems2;

/**
 * @author Ren
 */

import java.util.*;

public class R02_万万没想到之抓捕孔连顺 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        long  count = 0;
        for (int i = 0,j=i+2; i < n-2; i++) {
            long p;
            while (j < n && arr[j] - arr[i] <= d) {
                j++;
            }   //j++后判断是否符合条件  故p要-1
            p = j - i - 1;
            // 确定了i的位置  之后的两个位置在范围内进行任意组合  p*(p-1)/2
            count += (p*(p-1)/2);
        }
        System.out.println(count % 99997867);
    }
}
