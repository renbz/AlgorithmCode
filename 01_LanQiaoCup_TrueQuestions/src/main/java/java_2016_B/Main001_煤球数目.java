package java_2016_B;
public class Main001_煤球数目 {
	public static void main(String[] args) {
		int[] a = new int[100];
		a[0]=1;
		int t =2,sum = 1;;
		for(int i=1;i<100;i++) {
			a[i]=a[i-1]+t++;
			sum+=a[i];
		}
		System.out.println(sum);
	}

}