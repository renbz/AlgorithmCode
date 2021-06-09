package java_2017_A;
import java.util.Scanner;
public class Main007_正则问题 {
	static Scanner in = new Scanner(System.in);
	static String s = in.next();
	static int index = 0 ;
	public static void main(String[] args) {
		System.out.println(f());
	}
	private static int f() {
		int temp = 0,max = 0;
		while (index < s.length()){
			if(s.charAt(index)=='('){
				index++;
				temp += f();
			}else if(s.charAt(index)=='x'){
				index++;
				temp ++;
			}else if(s.charAt(index)=='|'){
				index++;
				max = Math.max(temp,max);
				temp = 0;
			}else if(s.charAt(index)==')'){
				index++;
				return Math.max(temp,max);
			}
		}
		return Math.max(temp,max);
	}
}