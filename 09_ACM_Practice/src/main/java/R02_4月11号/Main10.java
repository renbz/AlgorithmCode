package R02_4月11号;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long p = in.nextLong();
        long ans = f(n,p);

        if(n>=p) {
            System.out.println(0);
            return;
        }
        System.out.println(ans);


    }

    public static long f(long n, long p){
        if(n%p==0) return 0;
        long res= 1;
        long i;
        for (i = n%p; i >=1; i--) {
            i=i%p;
            res = res*i;
            res = res % p;
        }
        return res%p;
    }
}