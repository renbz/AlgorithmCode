package java_2013_A;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main008_带分数2 {
    static  int number,ans;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6,7,8,9};
        number = in.nextInt();
        f(a,0,9);
        System.out.println(ans);
    }
    //全排列
    private static void f(int[] a, int bin, int len) {
        if(bin == len-1){
            for (int i = 0; i <= bin-2 ; i++) {
                for (int j = i+1; j <= bin-1; j++) {
                    int x = get(a,0,i);//整数部分
                    int y = get(a,i+1,j);//分子
                    int z = get(a,j+1,bin);//分母
                    if(x < number){
                        if(y%z==0){
                            if(x+y/z == number){
                                ans++;
                            }
                        }
                    }
                }
            }
            return;
        }
        for (int i = bin; i < len; i++) {
            swap(a,bin,i);
            f(a,bin+1,len);
            swap(a,bin,i);
        }
    }
    //获取数组a区间i-j组成的数
    private static int get(int[] a, int i, int j) {
        int t = 1;
        int sum = 0;
        for (int k = j; k >= i; k--) {
            sum+=a[k]*t;
            t*=10;
        }
        return sum;
    }
    //交换
    private static void swap(int[] a, int bin, int i) {
        int t = a[bin];
        a[bin] = a[i];
        a[i] = t;
    }
}