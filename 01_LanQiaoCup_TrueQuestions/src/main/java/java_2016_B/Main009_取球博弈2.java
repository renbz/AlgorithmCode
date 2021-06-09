package java_2016_B;
import java.util.Arrays;
import java.util.Scanner;
public class Main009_取球博弈2 {
	static int []a = new int[3];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<5;i++) {
			int n = in.nextInt();
			char res = f(n,0,0);
			System.out.print(res+" ");
		}
	}
	// 采用记忆性递归：cache数组 用来存储已经出现的状态。
	static char[][][]cache = new char[1000][2][2];
	/**
	 * @param n    球的总数目
	 * @param me   我方持有的数目
	 * @param you  对手持有的数目
	 * @return
	 */
	private static char f(int n, int me, int you) {
		if(n<a[0]) {  // n<a[0] 即双方没有了可取的情况，游戏结束 即递归出口
			if((me&1)==1 && (you&1)==0)  return '+';
			if((me&1)==0 && (you&1)==1)  return '-';
			else return '0';
		}
		boolean pingju = false;
		for(int i=0;i<3;i++) {
			if(n>=a[i]) {
				char res = f(n-a[i], you, me+a[i]);// 注意此处的 me 和 you交换了位置
				if(res=='-')
					return '+';
				if(res == '0')
					pingju=true;
			}
		}
		// 如果程序走到这一行，说明不存在对手输的情况，那么是否存在平局的情况
		if(pingju) return '0';
		else return '-';
	}
}