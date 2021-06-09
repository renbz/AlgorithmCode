package java_2014_A;

/**
 * @author Ren
 */

/**
         ∵   f(n)=f(n-1)+f(n-2)  --> f(n) = f(n+1) - f(n-1)
         ∴   f(1) = f(2)=1
         f(2) = f(3) - f(1)
         f(3) = f(4) - f(2)
         f(4) = f(5) - f(3)
         f(5) = f(6) - f(4)
         ...  =  ...  -  ...
         f(n-2) = f(n-1) - f(n-3)
         f(n-1) = f(n) - f(n-2)
         f(n) = f(n+1) - f(n-1)

         两边相加得： ∑f(i) = f(n) + f(n+1) - 1
         又∵  f(n+2) = f(n+1) + f(n)
         ∴  ∑f(i) = f(n+2) - 1;
         */

// 使用矩阵快速幂解决此题，普通的迭代方法只能得40分
/**
         [1  1] * | 1  1  |  =  [ 2  1]
                  | 1  0  |

         [f(n-1)  f(n-2)] * | 1  1  |  =  [f(n)   f(n-1)]
                            | 1  0  |

         [f(2)  f(1)] * | 1  1 | ^ n  =  [f(n+2)   f(n+1)]
                        | 1  0 |

 */


//1.由定义fib(n) = fib(n+2)-fib(n+1)

//2.由1得Σf(n) = f(n+2)-1;

import java.math.BigInteger;
import java.util.Scanner;
//如果 m>=n+2那么f(m)>Σf(n)，结果是(f(n+2)-1)%p
//否则 结果为(f(n+2)-1)%f(m)%p==f(n+2)%f(m)%p-1
public class Main009_斐波那契3 {
    public static void main(String[] args) {
        // for (int i = 3; i <=10 ; i++) {
        //   System.out.println(fib(i).longValue());
        // }
        Scanner sc = new Scanner(System.in);
        long n, m, p;
        n = sc.nextLong();
        m = sc.nextLong();
        p = sc.nextLong();
        BigInteger bigP = BigInteger.valueOf(p);
        if (m >= n + 2) {
            BigInteger ans = fib(n + 2, bigP);
            System.out.println(ans.mod(bigP).longValue() - 1);
        } else {
            BigInteger fibm = fib(m);
            BigInteger ans = fib(n + 2, fibm);
            System.out.println(ans.mod(fibm).mod(bigP).longValue() - 1);
        }
    }
    /*快速矩阵求fib*/
    private static BigInteger fib(long m) {
        BigInteger[][] ans = mPow(m - 2);
        return ans[0][0].add(ans[1][0]);
    }
    private static BigInteger fib(long m, BigInteger mod) {
        BigInteger[][] ans = mPow(m - 2, mod);
        return ans[0][0].add(ans[1][0]);
    }
    /*矩阵快速幂运算*/
    private static BigInteger[][] mPow(long n) {
        // a 1110
        BigInteger[][] a =
                { { BigInteger.ONE, BigInteger.ONE },  { BigInteger.ONE, BigInteger.ZERO } };
        //单位矩阵
        BigInteger[][] ans =
                { { BigInteger.ONE, BigInteger.ZERO },  { BigInteger.ZERO, BigInteger.ONE } };
        while (n != 0) {
            if ((n & 1) == 1) {
                //结果ans乘以当前平方
                BigInteger t1 = ans[0][0];
                BigInteger t2 = ans[1][0];
                ans[0][0] = ans[0][0].multiply(a[0][0]).add(ans[0][1].multiply(a[1][0]));
                ans[0][1] = t1.multiply(a[0][1]).add(ans[0][1].multiply(a[1][1]));
                ans[1][0] = ans[1][0].multiply(a[0][0]).add(ans[1][1].multiply(a[1][0]));
                ans[1][1] = t2.multiply(a[0][1]).add(ans[1][1].multiply(a[1][1]));
            }
            //对a进行平方
            BigInteger t1 = a[0][0];
            BigInteger t2 = a[1][0];
            BigInteger t3 = a[0][1];
            a[0][0] = a[0][0].multiply(a[0][0]).add(a[0][1].multiply(a[1][0]));
            a[0][1] = t1.multiply(a[0][1]).add(a[0][1].multiply(a[1][1]));
            a[1][0] = a[1][0].multiply(t1).add(a[1][1].multiply(a[1][0]));
            a[1][1] = t2.multiply(t3).add(a[1][1].multiply(a[1][1]));
            n >>= 1;
        }
        return ans;
    }
    private static BigInteger[][] mPow(long n, BigInteger mod) {
        BigInteger[][] a =
                { { BigInteger.ONE, BigInteger.ONE },  { BigInteger.ONE, BigInteger.ZERO } };
        //单位矩阵
        BigInteger[][] ans =
                { { BigInteger.ONE, BigInteger.ZERO },  { BigInteger.ZERO, BigInteger.ONE } };
        while (n != 0) {
            if ((n & 1) == 1) {
                //结果乘以当前平方
                BigInteger t1 = ans[0][0];
                BigInteger t2 = ans[1][0];
                ans[0][0] = ans[0][0].multiply(a[0][0]).add(ans[0][1].multiply(a[1][0])).mod(mod);
                ans[0][1] = t1.multiply(a[0][1]).add(ans[0][1].multiply(a[1][1])).mod(mod);
                ans[1][0] = ans[1][0].multiply(a[0][0]).add(ans[1][1].multiply(a[1][0])).mod(mod);
                ans[1][1] = t2.multiply(a[0][1]).add(ans[1][1].multiply(a[1][1])).mod(mod);
            }
            //进行平方
            BigInteger t1 = a[0][0];
            BigInteger t2 = a[1][0];
            BigInteger t3 = a[0][1];
            a[0][0] = a[0][0].multiply(a[0][0]).add(a[0][1].multiply(a[1][0])).mod(mod);
            a[0][1] = t1.multiply(a[0][1]).add(a[0][1].multiply(a[1][1])).mod(mod);
            a[1][0] = a[1][0].multiply(t1).add(a[1][1].multiply(a[1][0])).mod(mod);
            a[1][1] = t2.multiply(t3).add(a[1][1].multiply(a[1][1])).mod(mod);
            n >>= 1;
        }
        return ans;
    }
}
