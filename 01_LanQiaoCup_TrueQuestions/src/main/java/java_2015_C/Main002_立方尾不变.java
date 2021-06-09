package java_2015_C;
public class Main002_立方尾不变 {
	public static void main(String[] args) {
		int count=0;
		for(long i=1;i<=10000;i++) {
			String s = String.valueOf(i*i*i);
			if(s.endsWith(i+""))  count++;
			
		}
		System.out.println(count);
	}
}