package java_2016_B;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main008_四平方和 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map map = new HashMap<Integer, Integer>();
		for(int c=0;c*c<=n/2;c++)
			for(int d=0;c*c+d*d<=n;d++) 
				map.put(c*c+d*d,c);
		for(int a=0;a*a<=n/4;a++) {
			for(int b=0;a*a+b*b<=n/2;b++) {
				if(map.get(n-a*a-b*b)!=null) {
					int c = (int) map.get(n-a*a-b*b);
					int d = (int) Math.sqrt(n-a*a-b*b-c*c);
					System.out.println(a+" "+b+" "+c+" "+d);
					return;
				}
			}
		}
	}
}
