package java_2017_B;
public class Main002_纸牌三角形 {
	static int [] a = new int[] {1,2,3,4,5,6,7,8,9};
	static int count = 0;
	public static void f(int k) {
		if(k==9) {
			// 判断三边之和是否相等，若相等 count++;
			int x1 = a[0]+a[1]+a[3]+a[5];
			int x2 = a[0]+a[2]+a[4]+a[8];
			int x3 = a[5]+a[6]+a[7]+a[8];
			if(x1==x2 && x2 ==x3)   count++;
		}
		/*  对 1~9 进行全排列，
	 	  *       把第 k 位以后的每一位交换到第一位
		 */
		for(int i=k;i<9;i++) {
			int t = a[k];
			a[k] = a[i];
			a[i] = t;
			f(k+1);
			t= a[k];
			a[k] = a[i];
			a[i] = t;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(count/6);
	}
}
