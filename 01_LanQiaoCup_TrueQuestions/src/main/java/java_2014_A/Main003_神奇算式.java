package java_2014_A;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main003_神奇算式 {
	
	public static void main(String[] args) {
		int ans=0;
		for(int i=1;i<1000;i++) 
			for(int j=1;j<1000;j++) 
				if(check1(i, j)) 
					for(int k=1000;k<=9999;k++) 
						if(i*j==k && i<=j && check2(i,j,k)) {
							ans++;
							System.out.println(i+" * "+j+" = "+k);
						}
		System.out.println(ans);
	}
	private static boolean check1(int i, int j) {
		String a1= ""+i+j;
		if(a1.length()!=4) return false;
		Set<Character> set = new HashSet<Character>();
		for(int t=0;t<4;t++) 
			set.add(a1.charAt(t));
		if(set.size()!=4) return false;
		return true;
	}

	private static boolean check2(int i, int j, int k) {
		String a1= ""+i+j,a2=""+k;
		char[]c1=a1.toCharArray();Arrays.sort(c1);
		String s1=""+c1[0]+c1[1]+c1[2]+c1[3];
		char[]c2=a2.toCharArray();Arrays.sort(c2);
		String s2=""+c2[0]+c2[1]+c2[2]+c2[3];
		if(s1.equals(s2)) return true;
		return false;
	}
}
