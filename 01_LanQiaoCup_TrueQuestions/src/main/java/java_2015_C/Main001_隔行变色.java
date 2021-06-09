package java_2015_C;
public class Main001_隔行变色 {
	public static void main(String[] args) {
		int ans=0;
		for(int i=21;i<=50;i++)
			if(i%2==1)  ans++;
		System.out.println(ans);
	}
}