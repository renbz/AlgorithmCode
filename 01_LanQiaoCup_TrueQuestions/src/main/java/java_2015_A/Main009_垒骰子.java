package java_2015_A;

/**
 * @author Ren
 */
import java.math.BigInteger;
import java.util.*;
public class Main009_垒骰子 {
    static long mod = 1000000007;
    static BigInteger MOD = BigInteger.valueOf(mod);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int m = in.nextInt();
        int[][] a = new int [m][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=in.nextInt();
            }
        }

        // 计算公式 24^n - m*4^n*n! = (6^n-m*n!)*4^n
        //1.   6^n , 使用快速幂
        BigInteger t1 = ex(6,n);
        //2.   m*n!
        BigInteger t2 = jc(m-1,n);
        //3.   4^n
        BigInteger t3 = ex(4,n);
        //4.   (6^n-m*n!)
        BigInteger t4 = t1.subtract(t2);
        //5.   (6^n-m*n!)*4^n
        BigInteger t5 = t3.multiply(t4).mod(MOD);
        System.out.println(t5);
    }

    //求快速幂的模板
    public static BigInteger ex(long n,long m){
        BigInteger pfs = BigInteger.valueOf(n); //n的一次方
        BigInteger result = BigInteger.ONE;
        while (m!=0){
            // 遇1 累乘现在的幂，[二进制中的1]
            if((m&1)==1){
                result = result.multiply(pfs);
            }
            //每移动一位，幂的值乘方一次
            pfs = pfs.multiply(pfs);
            // 右移一位
            m>>=1;
        }
        return result.mod(MOD);
    }
    //求 m*n!
    public static BigInteger jc(long m,long n){
        BigInteger result = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.multiply(BigInteger.valueOf(m));
    }
}
