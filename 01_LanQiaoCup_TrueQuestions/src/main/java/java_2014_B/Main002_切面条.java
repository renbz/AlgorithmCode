package java_2014_B;
public class Main002_切面条 {
	public static void main(String[] args) {
		int [] a = new int[15];
		a[0]=2;a[1]=3;
		for(int i=2;i<11;i++) {
			a[i]=2*a[i-1]-1;
		}
		System.out.println(a[10]);
	}
}