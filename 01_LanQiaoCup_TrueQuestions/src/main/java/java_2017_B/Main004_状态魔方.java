package java_2017_B;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Main004_状态魔方 {
	static char[] c = "AAAABBCC".toCharArray();
	static Set<String> set = new HashSet<String>();
	static ArrayList<String> al = new ArrayList<String>();
	public static void f(int k) {
		if(k==8) {
			String s = "" ;
			for(int i=0;i<8;i++) {
				s+=c[i];
			}
			set.add(s);
			al.add(s);
		}
		for(int i=k;i<8;i++) {
			char t = c[k];
			c[k] = c[i];
			c[i] = t;
			f(k+1);
			t = c[k];
			c[k] = c[i];
			c[i] = t;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		int ans = set.size()/2;
		System.out.println(ans);
		//System.out.println(8*7*6*5*4*3*2);
	}
}
