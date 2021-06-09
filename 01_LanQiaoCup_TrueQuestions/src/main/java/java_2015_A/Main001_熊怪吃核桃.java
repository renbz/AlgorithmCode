package java_2015_A;

public class Main001_熊怪吃核桃 {
	public static void main(String[] args) {
		int t = 1543,sum=0;
		while(t!=0) {
			if(t%2==1) {
				t=(t-1)/2;
				sum ++;
			}else   t=t/2;
		}
		System.out.println(sum);
	}
}
