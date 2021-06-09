package java_2017_A;
import java.util.HashSet;
import java.util.Set;
public class Main002_9数算式{
	static int[]a = {1,2,3,4,5,6,7,8,9};
	static int count;
	public static void main(String[] args) {
		per(0);
		int ans = count/2;
		System.out.println(ans);
	}
	private static void per(int k) {
		if(k==9) {
			for(int i=1;i<=8;i++) {
				int x1 = algor(0,i);
				int x2 = algor(i,9);
				if(check(x1*x2)) {
					count++;
				}
			}
		}
		for(int i=k;i<9;i++) {
			int t = a[i];
			a[i] = a[k];
			a[k] = t;
			per(k+1);
			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}
	private static boolean check(int x) {
		String s=x+"";
		if(s.length()!=9 || s.indexOf('0')>-1) return false;
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		return set.size()==9;
	}
	private static int algor(int i, int j) {
		int x = 0;
		int p = 1;
		for(int k=j-1;k>=i;k--) {
			x+=a[k]*p;
			p*=10;
		}
		return x;
	}
}
