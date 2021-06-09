package java_2016_B;
import java.util.*;
public class Main010_压缩变换 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new TreeMap<Integer,Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] a = new int[n];
		int [] r = new int[n];
		for(int i=0;i<n;i++) 
			a[i]=in.nextInt();
		for(int i=0;i<n;i++) {
			// 判断当前数字，是否已经出现过，如果第一次出现，存入map中，
			if(map.get(a[i])==null) {
				map.put(a[i],1);
				r[i]= -a[i];
			}else {
				// 如果当前数字不是第一次出现，从当前索引，从后往前推，直到a[i]==a[j]
				//  存入set中去重，以查看 这两个数之间出现了多少个不同的数。
				Set set = new TreeSet<Integer>();
				for(int j=i-1;a[i]!=a[j];j--) {
					set.add(a[j]);
				}
				r[i]=set.size();
			}
		}
		for(int i=0;i<n-1;i++) 
			System.out.print(r[i]+" ");
		System.out.println(r[n-1]);
	}
}
