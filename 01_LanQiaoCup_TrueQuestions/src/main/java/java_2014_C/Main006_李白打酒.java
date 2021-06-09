package java_2014_C;
public class Main006_李白打酒 {
	static int ans = 0;
	public static void main(String[] args) {
		int r = 2;
		String s = "";
		f(r,s);
		System.out.println(ans);
	}
	private static void f(int r,String s) {
		if(r==0 && s.length()==15) {
			int count1=0,count2=0;
			for(int i=0;i<15;i++) {
				if(s.charAt(i)=='a')  count1++;
				else count2++;
			}
			if(count1==5 && count2==10) {
				ans++;
				System.out.println(s);
			}
		}else {
			if(r==0) return;
			if(s.length()>15) return;
			f(r*2, s+"a");
			f(r-1, s+"b");
		}
	}
}