package java_2013_C;

/**
 * @author Ren
 */

public class Main004_第39级台阶 {
    static int ans = 0;
    public static void main(String[] args) {
        dfs(39,0);
        System.out.println(ans);
    }
    static void dfs(int n,int count){
        if(n<0) return;
        if(n==0 && count%2==0) ans++;
        dfs(n-1,count+1);
        dfs(n-2,count+1);
    }
}