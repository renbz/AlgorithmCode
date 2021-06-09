package java_2015_B;
import java.util.Vector;
public class Main004_循环节长度 {
	public static void main(String[] args) {
		System.out.println(f(11, 13));
	}
	public static int f(int n, int m){
		n = n % m;	
		Vector v = new Vector();
		for(;;){
			v.add(n);
			n *= 10;
			n = n % m;
			if(n==0) return 0;
			if(v.indexOf(n)>=0)    // 当在数组中能搜索到此元素时，说明前面已经出现过，产生重复
				//  因为循环部分可能不是从小数点后第一位开始，所以要用 size - 第一次出现时的索引
				return v.size()-v.indexOf(n);  //填空
		}
	}
}