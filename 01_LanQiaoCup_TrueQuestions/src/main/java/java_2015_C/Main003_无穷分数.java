package java_2015_C;
public class Main003_无穷分数 {
    public static void main(String[] args) {
	    double fn=0;
	    for (int i = 2000; i >=1 ; i--) 
	        fn=i/(fn+i);
	    System.out.println(fn);
    }
}
