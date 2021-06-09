package java_2013_C;

/**
 * @author Ren
 */
import java.util.*;
public class Main008_打印十字图 {
    static char[][] a;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int m = n*4+5;
        a = new char[m][m];
        dfs(n,0);
        a[0][0]='.';a[0][m-1]='.';a[m-1][0]='.';a[m-1][m-1]='.';
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j] != '$') a[i][j]='.';
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

    }

    private static void dfs(int n,int left_up) {
        if(n==1){
            for (int i = left_up; i < left_up+9; i++) {
                if(i!=left_up+1 && i!=left_up+7){
                    a[left_up][i] = '$';
                    a[left_up+8][i] = '$';
                    a[left_up+4][i] = '$';
                }
                if(i==left_up+2 || i==left_up+6 ) {
                    a[left_up + 1][i] = '$';
                    a[left_up + 7][i] = '$';
                }
                if(i!=left_up+3 && i!=left_up+5){
                    a[left_up+2][i] = '$';
                    a[left_up+6][i] = '$';
                }
                if(i==left_up || i==left_up+4 || i==left_up+8 ) {
                    a[left_up + 3][i] = '$';
                    a[left_up + 5][i] = '$';
                }
            }
            return;
        }else{
            //横着的格子
            for(int i=left_up;i<left_up+n*4+5;i++){
                if(i!=left_up+1 && i!=left_up+4*n+3){
                    a[left_up][i] = '$';
                    a[left_up+4*n+4][i] = '$';
                }
                if(i==left_up+2 || i==left_up+4*n+2){
                    a[left_up+1][i] = '$';
                    a[left_up+4*n+3][i] = '$';
                }
            }
            // 竖着的格子
            for (int i = left_up+2; i <= left_up+n*4+2; i++) {
                a[i][left_up] = '$';
                a[i][left_up+4+4*n] = '$';
                if(i==left_up+2 || i==left_up+4*n+2){
                    a[i][left_up+1] = '$';
                    a[i][left_up+3+4*n] = '$';
                }
            }
        }
        dfs(n-1,left_up+2);
    }
}