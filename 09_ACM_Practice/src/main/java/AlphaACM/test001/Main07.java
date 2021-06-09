package AlphaACM.test001;

/**
 * @author Ren
 */

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextInt();
        long b = in.nextInt();
        long res1 = gcd(a,b);
        long res2 = lcm1(a,b,res1);

        System.out.println(res1+res2);
    }

    static long lcm1(long a,long b,long gcd){
        return a*b/gcd;
    }
    static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
}
