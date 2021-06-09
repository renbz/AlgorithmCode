package java_2016_A;
import java.util.Scanner;
public class Main009_交换瓶子 {
	static int n ;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int count = 0;
		int[]a=new int[n+1];
		for(int i=1;i<=n;i++)
			a[i]=in.nextInt();
		for(int i=1;i<=n;i++) {
			if(a[i]==i)  continue;
			else {
				swap(a,a[i],i);
				count++;
			}
		}
		System.out.println(count);
	}
	private static void swap(int[]a,int ele, int index) {
		int t = 0;
		for(int i=1;i<=n;i++) {
			if(a[i]==index) {
				t = i;
				break;
			}
		}
		int temp = a[index];
		a[index]=a[t];
		a[t]=temp;
	}
}
