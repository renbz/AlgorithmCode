package java_2017_C;
import java.math.BigInteger;
public class Main001_外星日历 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 23%9;   //余5，星期E
		int b = 190%9;   //
		BigInteger m1 = new BigInteger("651764141421415346185");
		BigInteger m2 = m1.mod(BigInteger.valueOf(9));   // 得出余 7 ，所以结果为：G
		System.out.println(m2);
	}
}