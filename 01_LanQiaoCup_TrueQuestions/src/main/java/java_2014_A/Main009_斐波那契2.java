package java_2014_A;

import java.math.BigInteger;
import java.util.Scanner;

public class Main009_斐波那契2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n,m,p;
        n = in.nextLong();
        m = in.nextLong();
        p = in.nextLong();
        BigInteger bigP = BigInteger.valueOf(p);

        if(m >= n+2){
            BigInteger ans = fib(n+2,bigP);
            System.out.println(ans.mod(bigP).longValue()-1);
        }else{
            BigInteger fibm = fib(m);
            BigInteger ans = fib(n+2,fibm);
            System.out.println(ans.mod(fibm).mod(bigP).longValue()-1);
        }
    }
    /*快速矩阵求  fib*/
    private static BigInteger fib(long m){
        BigInteger[][] ans = mPow(m-2);
        return ans[0][0].add(ans[1][0]);
    }
    private static BigInteger fib(long m,BigInteger mod){
        BigInteger[][] ans = mPow(m-2,mod);
        return ans[0][0].add(ans[1][0]);
    }
    /*矩阵快速幂运算*/
    private static BigInteger[][] mPow(long n){
        BigInteger[][]a = {
                {BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}
        };
        //单元矩阵
        BigInteger[][] ans = {
                {BigInteger.ONE,BigInteger.ZERO},{BigInteger.ZERO,BigInteger.ONE}
        };
        while(n != 0){
            if((n & 1) == 1){
                // 结果乘以当前平方
                BigInteger t1 = ans[0][0];
                BigInteger t2 = ans[1][0];
                ans[0][0] = ans[0][0].multiply(a[0][0]).add(ans[0][1].multiply(a[1][0]));
                ans[0][1] = t1.multiply(a[0][1]).add(ans[0][1]).multiply(a[1][1]);
                ans[1][0] = ans[1][0].multiply(a[0][0]).add(ans[1][1].multiply(a[1][0]));
                ans[1][1] = t2.multiply(a[0][1]).add(ans[1][1]).multiply(a[1][1]);
            }
            // 对a进行平方
            BigInteger t1 = a[0][0];
            BigInteger t2 = a[1][0];
            BigInteger t3 = a[0][1];
            a[0][0] = a[0][0].multiply(a[0][0]).add(a[0][1].multiply(a[1][0]));
            a[0][1] = t1.multiply(a[0][1]).add(a[0][1].multiply(a[1][1]));
            a[1][0] = a[1][0].multiply(t1).add(a[1][1].multiply(a[1][0]));
            a[1][1] = t2.multiply(t3).add(a[1][1].multiply(a[1][1]));
            n>>=1;
        }
        return ans;
    }
    private static BigInteger[][] mPow(long n,BigInteger mod){
        BigInteger[][]a = {
                {BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}
        };
        //单元矩阵
        BigInteger[][] ans = {
                {BigInteger.ONE,BigInteger.ZERO},{BigInteger.ZERO,BigInteger.ONE}
        };
        while(n != 0){
            if((n & 1) == 1){
                // 结果乘以当前平方
                BigInteger t1 = ans[0][0];
                BigInteger t2 = ans[1][0];
                ans[0][0] = ans[0][0].multiply(a[0][0]).add(ans[0][1].multiply(a[1][0])).mod(mod);
                ans[0][1] = t1.multiply(a[0][1]).add(ans[0][1]).multiply(a[1][1]).mod(mod);
                ans[1][0] = ans[1][0].multiply(a[0][0]).add(ans[1][1].multiply(a[1][0])).mod(mod);
                ans[1][1] = t2.multiply(a[0][1]).add(ans[1][1]).multiply(a[1][1]).mod(mod);
            }
            // 对a进行平方
            BigInteger t1 = a[0][0];
            BigInteger t2 = a[1][0];
            BigInteger t3 = a[0][1];
            a[0][0] = a[0][0].multiply(a[0][0]).add(a[0][1].multiply(a[1][0])).mod(mod);
            a[0][1] = t1.multiply(a[0][1]).add(a[0][1].multiply(a[1][1])).mod(mod);
            a[1][0] = a[1][0].multiply(t1).add(a[1][1].multiply(a[1][0])).mod(mod);
            a[1][1] = t2.multiply(t3).add(a[1][1].multiply(a[1][1])).mod(mod);
            n>>=1;
        }
        return ans;
    }

}