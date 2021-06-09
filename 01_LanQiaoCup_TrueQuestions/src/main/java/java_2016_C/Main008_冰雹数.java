package java_2016_C;
import java.math.BigInteger;
import java.util.Scanner;
public class Main008_冰雹数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger zero = BigInteger.ZERO;
		BigInteger one = BigInteger.ONE;
		BigInteger two = BigInteger.valueOf(2);
		BigInteger three = BigInteger.valueOf(3);
		BigInteger b = BigInteger.valueOf(n);
		BigInteger max = BigInteger.valueOf(n);
		if(n==1) {
			System.out.println(4);
			return;
		}
		
		while((b.compareTo(one))!=0) {
			if((b.mod(two)).equals(zero)) {
				if((b.compareTo(max))==1) max=b;
				b=b.divide(two);
			}else {
				b=b.multiply(three).add(one);
				if(b.compareTo(max)==1) max=b;
			}
		}
		System.out.println(max);
	}
}