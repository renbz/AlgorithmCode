package 字节跳动.R_2019春招_problems2;

/**
 * @author Ren
 */

import java.util.*;
public class R06_找零 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a1 = 1024-n;

        int res1 = a1/64;
        int res2 = ( a1%64 ) / 16;
        int res3 = (a1%16) / 4;
        int res4 = a1%4;

        System.out.println(res1+res2+res3+res4);


    }

}
