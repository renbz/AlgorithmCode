package java_2015_B;

public class Main007_牌型总数2 {
	static int ans = 0;
	public static void main(String[] args) {
		f(0,0);
		System.out.println(ans);
	}
	private static void f(int kinds,int counts){
		if(kinds>13 || counts >13) return;
		if(counts == 13){
			ans++;
			return;
		}
		for (int i=0;i<5;i++){
			f(kinds+1,counts+i);
		}
	}
}