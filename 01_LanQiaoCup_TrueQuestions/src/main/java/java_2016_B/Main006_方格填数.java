package java_2016_B;
public class Main006_方格填数 {
	static int ans = 0;
	static int []a = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(ans);
	}

	private static void f(int k) {
		// TODO Auto-generated method stub
		if(k==10) {
			if(check(a))  ans++;
		}else {
			for(int i=k;i<10;i++) {
				int t = a[i];  a[i]=a[k]; a[k]=t;
				f(k+1);
				t = a[i];  a[i]=a[k]; a[k]=t;
			}
		}
		
	}
	private static boolean check(int[] a) {
		// TODO Auto-generated method stub
		if(Math.abs(a[0]-a[1])==1)  return false;
		if(Math.abs(a[0]-a[3])==1)  return false;
		if(Math.abs(a[0]-a[4])==1)  return false;
		if(Math.abs(a[0]-a[5])==1)  return false;
		if(Math.abs(a[1]-a[2])==1)  return false;
		if(Math.abs(a[1]-a[4])==1)  return false;
		if(Math.abs(a[1]-a[5])==1)  return false;
		if(Math.abs(a[1]-a[6])==1)  return false;
		if(Math.abs(a[2]-a[5])==1)  return false;
		if(Math.abs(a[2]-a[6])==1)  return false;
		if(Math.abs(a[3]-a[4])==1)  return false;
		if(Math.abs(a[3]-a[7])==1)  return false;
		if(Math.abs(a[3]-a[8])==1)  return false;
		if(Math.abs(a[4]-a[5])==1)  return false;
		if(Math.abs(a[4]-a[7])==1)  return false;
		if(Math.abs(a[4]-a[8])==1)  return false;
		if(Math.abs(a[4]-a[9])==1)  return false;
		if(Math.abs(a[5]-a[6])==1)  return false;
		if(Math.abs(a[5]-a[8])==1)  return false;
		if(Math.abs(a[5]-a[9])==1)  return false;
		if(Math.abs(a[6]-a[9])==1)  return false;
		if(Math.abs(a[7]-a[8])==1)  return false;
		if(Math.abs(a[8]-a[9])==1)  return false;
		return true;
	}

}
