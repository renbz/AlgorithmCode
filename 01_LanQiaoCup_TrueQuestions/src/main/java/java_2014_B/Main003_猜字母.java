package java_2014_B;
public class Main003_猜字母 {
	public static void main(String[] args) {
		String a1 = "abcdefghigklmnopqrs";
		StringBuffer a = new StringBuffer(a1);
		for(int i=0;i<125;i++)
			a=a.append(a1);
		char[]b = a.toString().toCharArray();
		int count = 2014;  // 记录当前数组中字母的个数
		for( ;count!=1; ) {  // 当只有一个非零元素时，停止循环
			boolean t = true;  // 引入boolean 值，隔一个非零元素，置零一次
			for(int i=0;i<2014;i++) {
				if(b[i] !='0'){
					if(t) {	
						b[i]='0';
						count--;
					}
					t = !t;
				}
			}
		}
		// 输出剩余的唯一一个 非零元素
		for(int i=0;i<2014;i++)
			if(b[i]!='0')  System.out.println(b[i]);
	}
}
