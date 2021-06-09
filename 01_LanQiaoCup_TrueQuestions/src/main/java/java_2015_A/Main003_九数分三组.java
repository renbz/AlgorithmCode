package java_2015_A;
public class Main003_九数分三组 {
	static int[]a = {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		f(0);
	}
	private static void f(int k) {
		if(k==9) {
			int m1 = 100*a[0]+10*a[1]+a[2];
			int m2 = 100*a[3]+10*a[4]+a[5];
			int m3 = 100*a[6]+10*a[7]+a[8];
			if(m2==2*m1 && m3==3*m1) System.out.print(m1+" ");
		}
		for(int i=k;i<9;i++) {
			int t=a[k];a[k]=a[i];a[i]=t;
			f(k+1);
			t=a[k];a[k]=a[i];a[i]=t;
		}
	}
}