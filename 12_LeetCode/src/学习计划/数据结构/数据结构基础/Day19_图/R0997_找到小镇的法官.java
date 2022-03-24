package 学习计划.数据结构.数据结构基础.Day19_图;

/**
 * @author Ren
 */

public class R0997_找到小镇的法官 {

    public int findJudge(int n, int[][] trust) {
        if (n==1) return 1;
        int[][] arr = new int[n + 1][2];
        for (int i = 0; i < n; i++) arr[i][0] = i;
        for (int i = 0; i < trust.length; i++){
            arr[trust[i][0]][1]--;
            arr[trust[i][1]][1]++;
        }
        for (int i = 0; i < n + 1; i++) if (arr[i][1] == n - 1) return i;
        return -1;
    }
}
