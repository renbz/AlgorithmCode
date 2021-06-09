package java_2017_A;
import java.util.Scanner;
public class Main010_油漆面积 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n =in.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[][]a = new int[n][4];
		for(int i=0;i<n;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=in.nextInt();
				if(a[i][j]>max) max=a[i][j];
				if(a[i][j]<min) min=a[i][j];
			}
		}
		boolean [][]t = new boolean[max-min+1][max-min+1];	
		for(int i=0;i<n;i++)
			for(int k1=a[i][0]-min;k1<a[i][2]-min;k1++)
				for(int k2=a[i][1]-min;k2<a[i][3]-min;k2++)
					t[k1][k2]=true;
		long count = 0;
		for(int i=0,m=t.length;i<m;i++)
			for(int j=0,m2=t[0].length;j<m2;j++)
				if(t[i][j]==true) count++;
		System.out.println(count);
	}
}
