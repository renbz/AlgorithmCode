package java_2017_B;
import java.util.Scanner;
public class Main009_分巧克力 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int []h = new int[n];
		int []w = new int[n];
		for(int i=0;i<n;i++) {
			h[i]=in.nextInt();
			w[i]=in.nextInt();
		}
		int l = 1,r=100001,ans=0;
		while(l<=r) {
			int count=0;
			int mid=(l+r)/2;
			for(int i=0;i<n;i++) {
				count += (h[i]/mid)*(w[i]/mid);
			}
			if(count>=k) {
				l=mid+1;
				ans = mid;
			}else {
				r=mid-1;
			}
		}
		System.out.println(ans);
	}
}