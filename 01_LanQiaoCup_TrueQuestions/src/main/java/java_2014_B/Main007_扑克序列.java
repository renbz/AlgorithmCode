package java_2014_B;
import java.util.Set;
import java.util.TreeSet;
public class Main007_扑克序列 {
	static char[]a = {'A','A','2','2','3','3','4','4'};
	static Set<String> set = new TreeSet<String>();
	public static void main(String[] args) {
		f(0);
		for(String s1 : set) {
			System.out.println(s1);
		}
	}
	private static void f(int k) {
		if(k==8) {
			if(check(a)) {
				String s = "";
				for(int i=0;i<8;i++)  s+=a[i];
				set.add(s);
			}
		}
		for(int i=k;i<8;i++) {
			char t = a[i];a[i]=a[k];a[k]=t;
			f(k+1);
			t = a[i];a[i]=a[k];a[k]=t;
		}
	}
	private static boolean check(char[] a2) {
		char[]b=a2;
		int indexA =0,index2=0,index3=0,index4=0;
		for(int i=0;i<8;i++) {
			if(b[i]=='A')	indexA = i-indexA;
			if(b[i]=='2')   index2 = i-index2;
			if(b[i]=='3')   index3 = i-index3;
			if(b[i]=='4')   index4 = i-index4;
		}
		if(indexA==2 && index2==3 && index3==4 && index4==5)
			return true;
		return false;
	}
}