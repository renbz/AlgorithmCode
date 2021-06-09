package java_2016_C;
import java.math.BigInteger;
import java.util.Scanner;
public class Main008_冰雹数2 {
  static BigInteger ZERO = BigInteger.ZERO;
  static BigInteger ONE = BigInteger.ONE;
  static BigInteger TWO = BigInteger.valueOf(2);
  static BigInteger THREE = BigInteger.valueOf(3);


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x = scan.nextInt();
    System.out.println(f(x));
  }

  private static BigInteger f(int x) {
    BigInteger[] buf = new BigInteger[x + 1];
    buf[0] = ZERO;
    buf[1] = BigInteger.valueOf(4);
    buf[2] = BigInteger.valueOf(4);
    for (int i = 3; i <= x; i++) {
      if (i % 2 == 0) {
        buf[i] = buf[i - 1];
        continue;
      }
      //i奇数
      BigInteger max = buf[i - 1];
      BigInteger i_big = BigInteger.valueOf(i);
      while (i_big.compareTo(ONE) != 0) {//变换之后的数不等于1就继续变换
        if (i_big.compareTo(max)==1)max=i_big;//更新max
        if (i_big.compareTo(BigInteger.valueOf(i))==-1)break;
        i_big = i_big.mod(TWO).equals(ZERO) ?
            i_big.divide(TWO)://偶数
            i_big.multiply(THREE).add(ONE);//奇数
      }
      buf[i]=max;
    }
    return buf[x];
  }
}