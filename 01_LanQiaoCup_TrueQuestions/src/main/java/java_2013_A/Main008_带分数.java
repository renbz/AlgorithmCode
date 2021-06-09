package java_2013_A;

/**
 * @author Ren
 */

import java.util.*;
public class Main008_带分数 {
    static int[] a = {1,2,3,4,5,6,7,8,9};
    static int n,ans,nl;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        nl = String.valueOf(n).length();
        f(0);
        System.out.println(ans);
    }
    private static void f(int k) {
        if (k == 9) {
            for (int i = 1; i <= nl; i++) {
                for (int j = i+1; j < 9; j++) {
                    int t1 = trans(a,0,i);
                    int t2 = trans(a,i,j);
                    int t3 = trans(a,j,9);
                    if(t2%t3==0 && n==t1+t2/t3){
                        ans++;
                    }
                }
            }
        }
        for (int i = k; i < 9; i++) {
            int t = a[i]; a[i] = a[k]; a[k] = t;
            f(k + 1);
            t = a[i]; a[i] = a[k]; a[k] = t;
        }
    }
    public static int trans(int[]a,int left,int right){
        int result = 0;
        for (int i = left; i < right; i++) {
            result = result*10+a[i];
        }
        return (int)result;
    }
}
