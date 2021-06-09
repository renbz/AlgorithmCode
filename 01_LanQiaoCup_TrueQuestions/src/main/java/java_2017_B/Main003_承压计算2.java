package java_2017_B;
import java.util.Arrays;
import java.util.Scanner;
public class Main003_承压计算2{
    static double[][] a  = new double[30][30];
 	public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	for(int i=0;i<29;i++) 
	    for(int j=0;j<=i;j++) 
	        a[i][j]=in.nextDouble();
	for(int i=0;i<29;i++) 
	    for(int j=0;j<=i;j++) { 
	        a[i+1][j] +=a[i][j]/2 ;
		    a[i+1][j+1] += a[i][j]/2;
	    }
 	Arrays.sort(a[29]);
  	double answer = a[29][29]*(2086458231/a[29][0]);
  	System.out.println((long)answer);
    }
}