package java_2015_B;
public class Main002_立方变自身 {
	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=999999;i++) {
			int sumEle = 0; // sumEle 为每位的和
			long t = i*i*i;
			String s = String.valueOf(t);
			for(int j=0;j<s.length();j++) 
				sumEle += s.charAt(j)-'0'; // s.charAt(j)-'0' , 代表每位上的数字
			if(sumEle==i) count++;
		}
		System.out.println(count);
	}
}