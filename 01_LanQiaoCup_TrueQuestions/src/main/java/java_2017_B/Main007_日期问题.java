package java_2017_B;
import java.util.*;
public class Main007_日期问题 {
	static Set<String> set = new TreeSet<String>(); 
	public static boolean isLeapYear(int year){
		return year%400==0 || ( year%4==0 && year%100 !=0 );
	}
	public static void check(int a,int b , int c){
		if(a>=60 && a<=99)  a += 1900;
		else if(a>=0  && a<=59)  a += 2000;
		else return;
		if(b>12||b<1) return;
		if(c>31||c<1) return;
		
		switch (b) {
		case 4:
		case 6:
		case 9:
		case 11:
			if(c>30) return ;
			break;
		case 2:
			if(isLeapYear(a)) {
				if(c>29) return;
			}else {
				if(c>28) return;
			}
//		default:
//			if(c>30) return;
//			break;
		}
		set.add(a+"-"+(b<10?"0"+b:b)+"-"+(c<10?"0"+c:c));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int a = (s.charAt(0)-'0')*10+s.charAt(1)-'0';
		int b = (s.charAt(3)-'0')*10+s.charAt(4)-'0';
		int c = (s.charAt(6)-'0')*10+s.charAt(7)-'0';
		check(a, b, c);
		check(c, a, b);
		check(c, b, a);	
		for(String str:set) {
			System.out.println(str);
		}
	}
}
