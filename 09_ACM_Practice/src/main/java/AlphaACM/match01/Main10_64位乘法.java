package AlphaACM.match01;

/**
 * @author Ren
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Main10_64位乘法 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger p = in.nextBigInteger();
        System.out.println(a.multiply(b).mod(p));
    }
}