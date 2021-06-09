package java_2017_A;
public class Main004_方格分割 {
	static int[][]t = new int[7][7];
	static int count = 0;
	static int vir [][] = {{1,0},{-1,0},{0,1},{0,-1}};
	public static void main(String[] args) {
		dfs(3,3);
		System.out.println(count/4);
	}
	private static void dfs(int x, int y) {
		if(x==0 || x==6 || y==0 || y==6) {
			count++;
			return ;
		}
		t[x][y] = 1;
		t[6-x][6-y] = 1; // 关于中心点的对称点也要标注
		for(int i=0;i<4;i++) {
			int nx = x+vir[i][0];
			int ny = y+vir[i][1];
			if(t[nx][ny]==0)  dfs(nx, ny);
		}
		//  回溯
		t[x][y] = 0;
		t[6-x][6-y] = 0;
	}
}