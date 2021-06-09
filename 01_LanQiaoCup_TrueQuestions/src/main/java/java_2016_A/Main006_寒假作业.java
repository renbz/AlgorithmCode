package java_2016_A;
public class Main006_寒假作业 {
	static int[]a = {1,2,3,4,5,6,7,8,9,10,11,12,13};
	static int ans;
	public static void main(String[] args) {
		f(0);
		System.out.println(ans);
	}
	private static void f(int k) {
		if(k==13 && a[0]+a[1]==a[2]&&a[3]-a[4]==a[5]&&a[6]*a[7]==a[8]
				&& a[9]%a[10]==0 && a[9]/a[10]==a[11]) {
			ans++;
		}
		for(int i=k;i<13;i++) {
			int t=a[i];a[i]=a[k];a[k]=t;
			f(k+1);
			t=a[i];a[i]=a[k];a[k]=t;
		}
	}
}
