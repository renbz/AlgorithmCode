package java_2017_B;
import java.util.Scanner;
public class Main010_K倍区间 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[]a = new int[n];
		int[]dp = new int[n];
		int[]count = new int[k];
		int last = 0;
		long ans = 0;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
			dp[i] = (last+a[i])%k;
			last = dp[i];
			ans+=count[dp[i]]++;
		}
//		for(int i=0;i<k;i++) {
//			ans += count[i]*(count[i]-1)/2;
//		}
		System.out.println(ans+count[0]);
	}
}