package java_2016_C;
public class Main007_搭积木 {
	static int ans;
	static int[]a = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		f(0);
		System.out.println(ans);
	}
	private static void f(int k) {
		if(k==10&&a[0]<a[1]&&a[0]<a[2]&&a[1]<a[3]&&a[1]<a[4]&&a[2]<a[4]&&a[2]<a[5]
		     &&a[3]<a[6]&&a[3]<a[7]&&a[4]<a[7]&&a[4]<a[8]&&a[5]<a[8]&&a[5]<a[9]) {
			   ans++;
		}
		for(int i=k;i<10;i++) {
			int t=a[i]; a[i]=a[k];a[k]=t;
			f(k+1);
			t=a[i]; a[i]=a[k];a[k]=t;
		}
	}
}