package java_2015_C;
import java.util.Scanner;
public class Main009_打印大X {
	static String []a;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		a = new String[n];
		// 对字符串进行初始化，否则a[i] = null
		for(int i=0;i<n;i++)
			a[i]="";
		int t1 = 0;  // 记录 每行的 点(前半部分)的个数
		//  生成每一行的字符串，因为前 0~n/2 行与  n/2 ~ n-1行相反
		// (不包含第n/2行) 所以无需重复计算，在输出部分修改即可
		for(int i=0;i<=n/2;i++) {
			// 先生成前面的  点和星部分
			a[i]+=printDian(i);
			t1 = a[i].length();
			a[i]+=printX(m);
			// 如果 宽度减去2倍的前部分的点+X>=0，那么剩余的中间的长度为空格
			if(m+n-1-2*a[i].length()>=0) {
				StringBuffer sb = new StringBuffer(a[i]);
				sb.reverse();
				a[i]+=printDian(m+n-1-2*a[i].length());
				a[i]+=sb.toString();
			}
			// else 宽度减去 前部分点+X的长度，在减去 最后点的长度(和前面点的长度相同 为t1)
			//       剩余部分为 X号 的长度，再打印剩余 点号的长度
			else {  
				a[i]+=printX(m+n-1-a[i].length()-t1);
				a[i]+=printDian(t1);
			}
		}
		// 输出
		for(int i=0;i<=n/2;i++) 
			System.out.println(a[i]);
		for(int i=n/2-1;i>=0;i--)
			System.out.println(a[i]);
	}
	// 传入一个整数 i ,打印 i 个 " *X"
	private static String printX(int i) {
		StringBuffer sb = new StringBuffer();
		for(int j=0;j<i;j++)
			sb.append("X");
		return sb.toString();
	}
	// 传入一个整数 i ,打印 i 个 " .  "
	private static String printDian(int i) {
		StringBuffer sb = new StringBuffer();
		for(int j=0;j<i;j++)
			sb.append(".");
		return sb.toString();
	}
	

}
