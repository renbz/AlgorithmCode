package java_2015_B;
public class Main006_加法变乘法 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1;i<=49;i++) 
			for(int j=1;j<=49;j++) 
				// 用 1- 49 的和   减去被替换的数字，加上被替换后相乘的值，再判断是否为2015
				if(1225-2*i-1-2*j-1+i*(i+1)+j*(j+1)==2015 && i<j ) 
					System.out.println(i+" * "+(i+1)+"   "+j+" * "+(j+1));
	}
}
