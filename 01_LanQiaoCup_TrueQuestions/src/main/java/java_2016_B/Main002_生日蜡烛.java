package java_2016_B;
public class Main002_生日蜡烛 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++){
			int sum=i;
			int t = i;
			while(sum<=236) {
				if(sum==236) {
					System.out.println(i);
					System.exit(0);
				}
				else  sum += ++t;
			}
		}
	}
}
