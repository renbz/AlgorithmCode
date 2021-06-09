package java_2020_B;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;
public class Main007_八次求和_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger mod = BigInteger.valueOf(123456789);
        int n = in.nextInt();
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= n; i++) {
            BigInteger temp = new BigInteger(i + "").pow(8);
            sum = sum.add(temp).mod(mod);
        }
        System.out.println(sum);
    }
}