package java_2017_B;

public class Main005_取数位{
	static int len(int x){
		if(x<10) return 1;
		return len(x/10)+1;
	}
	// 取x的第k位数字
	static int f(int x, int k){
		if(len(x)-k==0) return x%10;
		return f(x/10, k) ;  //填空
	}
	public static void main(String[] args){
		int x = 23513;
		//System.out.println(len(x));
		System.out.println(f(x,3));
	}
}