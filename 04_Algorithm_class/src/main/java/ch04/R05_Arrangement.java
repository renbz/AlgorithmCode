package ch04;

/**
 * @author Ren
 */

public class R05_Arrangement {
    public static void main(String[] args) {

    }

    /*static void arrangement()(int n,int a[][]){
        if(n==1){
            a[0][0]=1;
            return;
        }
        arrangement(n/2,a);
        merge(n,a);
    }

    static void merge(int n,int [][]a){
        int m = n/2;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j+m]=a[i][j]+m;
                a[i+m][j]=a[i][j+m];
                a[i+m][j+m]=a[i][j];
            }
        }
    }*/
}
