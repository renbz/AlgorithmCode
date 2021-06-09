package java_2016_C;
import java.util.Scanner;
public class Main010_密码脱落2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		//方法： s.length - s和s逆序的LCS
		String s2 = new StringBuilder(s1).reverse().toString();
		int ans = s1.length() - LCS(s1,s2);
		System.out.println(ans);
	}

	private static int LCS(String s1, String s2) {
		int [][] dp = new int[s1.length()+1][s2.length()+1];
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				if(s1.charAt(i)==s2.charAt(j)){
					dp[i+1][j+1] = dp[i][j]+1;
				}else{
					dp[i+1][j+1]=Math.max(dp[i+1][j],dp[i][j+1]);
				}
			}
		}
		return  dp[s1.length()][s2.length()];
	}
}