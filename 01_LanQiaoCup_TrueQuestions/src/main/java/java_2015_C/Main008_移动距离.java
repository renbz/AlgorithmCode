package java_2015_C;
import java.util.Scanner;
public class Main008_移动距离 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt(),m=in.nextInt(),n=in.nextInt();
		// 奇数行为 正序 ，偶数行为  逆序。 t1 、t2 为 m 、 n 的行号。
		int t1 = m%w==0?m/w:m/w+1;
		int t2 = n%w==0?n/w:n/w+1;
		// 纵向距离：
		int c = Math.abs(t1-t2);
		// 横向距离
		int indexM=0,indexN=0;    // 横向位置，从1开始
		if(t1%2==0)  indexM = w-(m-(t1-1)*w)+1;    // 如果 m 元素在偶数行
		else indexM = (m-(t1-1)*w);                // 如果 m 元素在奇数行
		if(t2%2==0)  indexN = w-(n-(t2-1)*w)+1;    // 如果 n 元素在偶数行
		else indexN = (n-(t2-1)*w);                // 如果 n 元素在奇数行
		int r = Math.abs(indexM-indexN);
		System.out.println(c+r);
	}
}