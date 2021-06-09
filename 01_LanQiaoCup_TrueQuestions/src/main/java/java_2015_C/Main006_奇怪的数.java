package java_2015_C;
import java.util.HashSet;
import java.util.Set;
public class Main006_奇怪的数 {
	public static void main(String[] args) {
		String s = "";
		for(long i=1;i<10000;i++) {
			s = i*i*i +""+ i*i ;
			if(s.length()==10) {
				Set<Character> set = new HashSet<>();
				for(int j=0;j<s.length();j++) 
					set.add(s.charAt(j));
				if(set.size()==10)
					System.out.println("答案为："+i+"\n"+"因为 : "
						+"\n"+i+"*"+i+" = "+i*i+"\n"+i+"*"+i+"*"+i+" = "+i*i*i+"\n"
						+"平方的值和立方的值 字符串拼接后\n"
						+i*i+""+i*i*i);
			}
		}
	}
}