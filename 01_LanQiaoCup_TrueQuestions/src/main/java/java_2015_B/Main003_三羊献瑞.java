package java_2015_B;
public class Main003_三羊献瑞 {
	static int []a = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		f(0);
	}
	private static void f(int k) {
		if(k==10 &&a[0] !=0&&a[4]!=0) {
			int m1 = 1000*a[0]+100*a[1]+10*a[2]+a[3];
			int m2 = 1000*a[4]+100*a[5]+10*a[6]+a[1];
			int m3 = 10000*a[4]+1000*a[5]+100*a[2]+10*a[1]+a[7];
			if(m1+m2==m3) {
				System.out.println("   "+a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
				System.out.println("+  "+a[4]+" "+a[5]+" "+a[6]+" "+a[1]);
				System.out.println("—————————————————");
				System.out.println(" "+a[4]+" "+a[5]+" "+a[2]+" "+a[1]+" "+a[7]);
				System.out.println("\n");
			}
		}
		for(int i=k;i<10;i++) {
			int t=a[i];a[i]=a[k];a[k]=t;
			f(k+1);
			t=a[i];a[i]=a[k];a[k]=t;
		}
	}
}