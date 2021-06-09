package java_2017_A;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Main010_油漆面积3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][]a = new int[n][4];
		for(int i=0;i<n;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=in.nextInt();
			}
		}
		Set<String> set = new TreeSet<String>();
		int [][]t = new int[max-min+1][max-min+1];	
		for(int i=0;i<n;i++)
			for(int k1=a[i][0];k1<a[i][2];k1++)
				for(int k2=a[i][1];k2<a[i][3];k2++) {
					StringBuffer sb = new StringBuffer();
					sb.append(k1);sb.append("*");sb.append(k2);
					set.add(sb.toString());
					}
		System.out.println(set.size());
	}
}
