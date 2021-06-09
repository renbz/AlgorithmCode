package java_2016_C;
import java.util.Scanner;
public class Main010_密码脱落1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int ans = dfs(s,0,s.length()-1,0);
		System.out.println(ans);
	}
	public static int dfs(String s, int left , int right ,int count){
		if(left >= right) return count;
		if(s.charAt(left) != s.charAt(right)){
			return Math.min(dfs(s,left+1,right,count+1),dfs(s,left,right-1,count+1));
		}else{
			return dfs(s,left+1,right-1,count);
		}
	}
}