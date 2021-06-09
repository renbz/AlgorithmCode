package java_2016_B;
import java.util.Scanner;
public class Main009_取球博弈 {
	static int a,b,c;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		int t = 5;
		while(t-->0) {
			StringBuffer sb = new StringBuffer();
			int s = in.nextInt();
			int prec = 0,nextc=0;
			int []m = new int[3];
			boolean bool = true;
			dfs(prec,nextc,s-a,m,bool,a);
			dfs(prec,nextc,s-b,m,bool,b);
			dfs(prec,nextc,s-c,m,bool,c);
			if(m[0]==1) {
				System.out.print("+");
			}else if(m[1]==1) {
				System.out.print("0");
			}else if(m[2]==1) {
				System.out.print("-");
			}
		}
	}
	private static void dfs(int prec, int nextc, int s,int[]m,boolean bool,int x) {
		if(s<a) {
			if(prec%2==1 && nextc%2==0) {
				m[0]=1;
				return;
			}else if(prec%2==nextc%2) {
				m[1]=1;
			}else if(prec%2==0 && nextc%2==1) {
				m[2]=1;
			}else {
				if(bool)  prec +=x;
				else nextc +=x;
				bool = !bool;
				dfs(prec, nextc, s-a, m,bool,a);
				dfs(prec, nextc, s-b, m,bool,b);
				dfs(prec, nextc, s-c, m,bool,c);
			}
		}
	}
}
