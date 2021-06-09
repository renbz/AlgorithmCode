package java_2016_B;
public class Main003_凑算式 {
	static int[]a = {1,2,3,4,5,6,7,8,9};
	static int count = 0 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(count);
	}
	private static void f(int k) {
		if(k==9) {
			int m1 = a[0];
			int m2 = a[1];
			int m3 = a[2];
			int m4 = a[3]*100+a[4]*10+a[5];
			int m5 = a[6]*100+a[7]*10+a[8];
			if((m2*m5+m3*m4)%(m3*m5)==0 && m1+(m2*m5+m3*m4)/(m3*m5)==10) {
				count++;
			}
		}else {
			for(int i=k;i<9;i++) {
				int t = a[i]; a[i] = a[k]; a[k] = t;
				f(k+1);
				t = a[i]; a[i] = a[k]; a[k] = t;
			}
		}
	}
}
