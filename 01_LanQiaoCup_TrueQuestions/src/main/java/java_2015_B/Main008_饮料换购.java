package java_2015_B;
import java.util.Scanner;
public class Main008_饮料换购 {
	static int ans;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		f(n);
		System.out.println(ans+n);
	}
	private static void f(int n) {
		int t = 0,y=0;
		if(n==1 || n==2) return ;
		if(n==3)  ans++;
		else {
			ans+=n/3;
			f(n/3+n%3);
		}
	}
}