package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Main007_八次求和_1 {
    public static BigInteger eight(int t){
        BigInteger m = BigInteger.valueOf(t);
        m=m.multiply(m);   // 2次方
        m = m.multiply(m); // 4次方
        m = m.multiply(m); // 8次方
        return m;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger mod = BigInteger.valueOf(123456789);
        int n = in.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for(int i=1;i<=n;i++){
            sum = sum.add(eight(i)).mod(mod);
        }
        System.out.println(sum);
    }
}