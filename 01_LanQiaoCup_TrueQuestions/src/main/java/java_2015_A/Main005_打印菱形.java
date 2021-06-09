package java_2015_A;
public class Main005_打印菱形{
	public static void f(int n){
		String s = "*";
		for(int i=0; i<2*n-3; i++) s += ".";
		s += "*";
	
		String s1 = s + "\n";
		String s2 = "";
		
		for(int i=0; i<n-1; i++){
			//System.out.println("=>"+s);
			// i+1个点       1个星   2*(n-1-i)-3个点       一个星
			// 填空部分：  i个点 1个星   2*(n-1-i)-3个点     共2*n+i-4个字符
			// 正好可以从已生成的 s1的第一行前面截取
			s = "." +  s1.substring(0,2*n-i-4)   + "*";  //填空
			s1 = s + "\n" + s1;
			s2 += s + "\n";
		}
		System.out.println(s1+s2);		
	}
	
	public static void main(String[] args){
		f(8);
	}
}
