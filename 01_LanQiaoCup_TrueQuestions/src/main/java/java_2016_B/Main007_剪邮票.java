package java_2016_B;
import java.util.Set;
import java.util.TreeSet;
public class Main007_剪邮票 {
	static int size;
	static int a[] = {0,0,0,0,0,0,0,1,1,1,1,1};
	static int t[][] = new int[3][4];
	static int ans;
	static Set<String> set = new TreeSet<String>();
	public static void main(String[] args) {
		f(0);
		System.out.println(ans);
	}
	private static void f(int k) {
		if(k==12) {
			StringBuffer sb = new StringBuffer();
			for(int i=0;i<12;i++) {
				sb.append(a[i]);
			}
			set.add(sb.toString());
			if(set.size()>size) {
				size=set.size();
				// 执行语句
				for(int i=0;i<3;i++){
					for(int j=0;j<4;j++) {
						t[i][j]=a[4*i+j];
					}
				}
				int count=0; // count记录连通块的个数，即5张小邮票是否相邻，count=1则5个方块相邻
				// 已经生成相应的含5个元素的数组，转化为求连通块的问题
				for(int i=0;i<3;i++)
					for(int j=0;j<4;j++) 
						if(t[i][j]==1) {
							dfs(i,j);
							count++;
						}
				if(count==1) ans++;
			}
		}else {
			// 对数组a的数据进行全排列
			for(int i=k;i<12;i++) {
				int t = a[i]; a[i] = a[k]; a[k] = t;
				f(k+1);
				t = a[i]; a[i] = a[k]; a[k] = t;
			}
		}
	}
	private static void dfs(int i, int j) {
		t[i][j]=0;
		if(i+1<=2&&t[i+1][j]==1) dfs(i+1, j);
		if(i-1>=0&&t[i-1][j]==1) dfs(i-1, j);
		if(j+1<=3&&t[i][j+1]==1) dfs(i, j+1);
		if(j-1>=0&&t[i][j-1]==1) dfs(i, j-1);
	}
}
