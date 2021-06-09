package java_2017_B;
import java.util.Scanner;
public class Main008_包子凑数 {
	//  计算两个数的最大公约数
	static int gcd1 (int a,int b){
	    return b==0?a:gcd1(b,a%b);
	}
	//  计算多个数的最大公约数
	static int gcd2(int [] a){
	    int n = a.length;
	    int L = a[0];
	    for(int i=1;i<n;i++)
	        L = gcd1(L,a[i]);
	    return L;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int[n];
		boolean []b = new boolean [10000];
		b[0] = true;
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int gcd = gcd2(a);
		/* 如果最大公约数不为1，一定有无数个数凑不出来
		 *     例如 ， 多个数的最大公约数为2 ，则所以的 奇数都凑不出
		 */
		if(gcd!=1) {
			System.out.println("INF");
			System.exit(0);
		}else {  
			/*  当最大公约数为1时，即互质
			  *        如果 某个数能凑出，那么它加上任意一个输入的包子数，都能凑出
			    so,从零到10000扫描n次 ，逐个检查是否能凑出         */
			for(int i = 0;i<n;i++) {
				for(int j=0;j+a[i]<10000;j++) {
					if(b[j]) b[j+a[i]] = true;
				}
			}
		}
		int count = 0;  //计数，记录凑不出的数
		for(int i=0;i<10000;i++) {
			if(b[i]==false) count++;
		}
		System.out.println(count);
	}
}