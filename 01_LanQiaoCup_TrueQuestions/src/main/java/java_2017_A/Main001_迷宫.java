package java_2017_A;
public class Main001_迷宫 {
	static int[][] t = new int[10][10];
	public static void main(String[] args) {
		char dir[][] = new char[][] {
			{'U','D','D','L','U','U','L','R','U','L'},
			{'U','U','R','L','L','L','R','R','R','U'},
			{'R','R','U','U','R','L','D','L','R','D'},
			{'R','U','D','D','D','D','U','U','U','U'},
			{'U','R','U','D','L','L','R','R','U','U'},
			{'D','U','R','L','R','L','D','L','R','L'},
			{'U','L','L','U','R','L','L','R','D','U'},
			{'R','D','L','U','L','L','R','D','D','D'},
			{'U','U','D','D','U','D','U','D','L','L'},
			{'U','L','R','D','L','U','U','R','R','R'},
		};
		int count = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++){
				SetZero(t);
				if(check(i,j,dir))  count++;
			}
		}
		System.out.println(count);
	}
	private static void SetZero(int[][] t2) {
		for(int i=0;i<10;i++) 
			for(int j=0;j<10;j++)
				t[i][j]=0;
	}
	private static boolean check(int i,int j,char[][]dir) {
		if(i<0||i>9||j<0||j>9)  return true;
		else if(t[i][j]==1)    return false;
		else {
			t[i][j] = 1;
			switch(dir[i][j]){
			    case 'U':
				    return check(i-1, j, dir);
			    case 'D' :
			    	return check(i+1, j, dir);
			    case 'L' :
			    	return check(i, j-1, dir);
			    case 'R' :
			    	return check(i, j+1, dir);
			    default :
			    	return false;
			}
		}
	}
}
