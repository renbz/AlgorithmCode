package java_2015_A;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main009_垒骰子1 {
    static long mod = 1000000007;
    static int[] op = {0,4,5,6,1,2,3}; //索引和值的对应为 骰子面的对应
    static boolean [][] con = new boolean[7][7];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            con[a][b] = true;
            con[b][a] = true;
        }
        long ans = 0;
        for(int i=1;i<=6;i++){
            ans = (ans+4*f(i,n-1))%mod;
        }
        System.out.println(ans);
    }
    static long f(int up,long cnt){
        long ans = 0;
        if(cnt == 0) return 4;
        for (int i = 1; i <= 6; i++) {
            if(!con[op[up]][i]){
                ans=(ans+f(i,cnt-1))%mod;
            }
        }
        return ans;
    }
}