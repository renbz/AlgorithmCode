package java_2016_C;
public class Main001_有奖猜谜 {
	public static void main(String[] args) {
		String s = "vxvxvxvxvxvxvvx";
		int n = 777;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='v')  n *= 2 ;
			if(s.charAt(i)=='x')  n -= 555 ;
		}
		System.out.println(n);
	}
}
