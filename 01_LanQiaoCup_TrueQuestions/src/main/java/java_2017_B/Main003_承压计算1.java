package java_2017_B;
import java.util.Arrays;
import java.util.Scanner;
public class Main003_承压计算1 {
	static long[][] a  = new long[30][30];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long multiply = 1<<30;
		System.out.println(multiply);
		for(int i=0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i][j]=in.nextLong()*multiply;
			}
		}
		for(int i =0;i<29;i++) {
			for(int j=0;j<=i;j++) {
				a[i+1][j] += a[i][j]/2;
				a[i+1][j+1] += a[i][j]/2;
			}
		}
		Arrays.sort(a[29]);
		System.out.println(a[29][0]);
		long truemultiply = a[29][0]/2086458231;
		//System.out.println(truemultiply);
		long answer = a[29][29]/truemultiply;
		System.out.println(answer);
	}
}