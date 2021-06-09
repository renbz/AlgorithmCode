package java_2017_C;
import java.util.*;
public class Main007_Excel地址 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		String str = "ZABCDEFGHIJKLMNOPQRSTUVWXY";
		StringBuffer sb = new StringBuffer();
 		while(a>0) {
 			if(a%26==0) {
 				sb.append(str.charAt(a%26));
 				a=a-26;
 			}else {
 				sb.append(str.charAt(a%26));
 			}
 			a=a/26;
 		}
 		sb.reverse();
 		System.out.println(sb);
	}
}