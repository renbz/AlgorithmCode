package java_2014_A;

import java.math.BigInteger;
import java.util.Scanner;

public class Main009_斐波那契 {
    static Scanner in = new Scanner(System.in);
    static long n = in.nextLong();
    static long m = in.nextLong();
    static BigInteger p = in.nextBigInteger();

    public static void main(String[] args) {

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

        // 初始的斐波那契
		BigInteger[][] fbnq = {{BigInteger.valueOf(1),BigInteger.valueOf(1)}};
		BigInteger ans = BigInteger.ZERO;
		BigInteger fm = BigInteger.ZERO;
        if((n+2)<m){
        	ans = matrixPower(fbnq,n)[0][0].mod(p);
        	//ans为 f(n+2)%f(m)%p
		}else{
        	fm = matrixPower(fbnq,m-2)[0][0].mod(p);
			ans = matrixPower(fbnq,n)[0][0].mod(fm).mod(p);
		}

    }

    // 求矩阵m的n次方
    public static BigInteger[][] matrixPower(BigInteger[][] matrix, long q) {
        // 初始化结果为单位矩阵，对角线为1
        BigInteger[][] ans = new BigInteger[2][2];
        ans[0][0] = BigInteger.valueOf(1);
        ans[1][1] = BigInteger.valueOf(1);
        // 平方数
        BigInteger[][] pf = matrix; // 一次方
        while (q != 0) {
            if ((q & 1) != 0) {
                // 当前二进制的最低位为1，将当前平方数乘到结果中
                pf = multiply(pf, pf);
                q >>= 1;
            }
        }
        return ans;
    }
    // 矩阵相乘
    static BigInteger[][] multiply(BigInteger[][] m1, BigInteger[][] m2) {
        int m1Row = m1.length;
        int m1Line = m1[0].length;
        //if (m1Line != m2.length) throw new IllegalArgumentException();
        int m2Line = m2[0].length;
        // m1的行数为新矩阵的行数，m2的列数为新矩阵的列数
        BigInteger[][] result = new BigInteger[m1Row][m2Line];
        for (int i = 0; i < m1Row; i++)
            for (int j = 0; j < m2Line; j++)
                for (int k = 0; k < m1Line; k++) {
                    result[i][j] = (m1[i][k].multiply(m2[k][j])).add(result[i][j]);
                    result[i][j] = result[i][j].mod(p);
                }
        return result;
    }
}