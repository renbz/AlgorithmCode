package 学习计划.力扣杯竞赛真题集.R2021春赛题集;

import java.util.List;

/**
 * @author Ren - 乔治的哥们
 * @Date: 2021/12/30 10:25
 * @Description:
 */

public class LCP31_变换的迷宫 {

    private int[][] directions={{0,1},{1,0},{0,0},{0,-1},{-1,0}};

    private char[][][] matrixs;
    private boolean[][][][] dp;
    private int l;
    private int m;
    private int n;

    public boolean escapeMaze(List<List<String>> maze) {
        matrixs=new char[maze.size()][][];
        for(int i=0;i<maze.size();i++) matrixs[i]=parsematrixs(maze.get(i));

        l=matrixs.length;
        m=matrixs[0].length;
        n=matrixs[0][0].length;
        dp=new boolean[l+1][m][n][4];

        return dfs(1,0,0,3);
    }

    private boolean dfs(int t,int r,int c,int s){
        if(dp[t][r][c][s]) return false; //记忆化搜索时先查表

        if(r==m-1&&c==n-1) return true;
        if(t==l) return false;

        char[][] mtx=matrixs[t];
        for(int[] d:directions){
            int dr=r+d[0],dc=c+d[1];
            if(dr<0||dc<0||dr==m||dc==n) continue;

            if(mtx[dr][dc]=='.'){
                if(dfs(t+1, dr, dc, s)) return true;
            }else{
                if(s==3){
                    if(dfs(t+1, dr, dc, 2)) return true;
                    for(int dt=t+1;dt<l;dt++){
                        if(dfs(dt, dr, dc, 1)) return true;
                    }
                }else if(s==2){
                    for(int dt=t+1;dt<l;dt++){
                        if(dfs(dt, dr, dc, 0)) return true;
                    }
                }else if(s==1){
                    if(dfs(t+1, dr, dc, 0)) return true;
                }
            }
        }

        dp[t][r][c][s]=true;
        return false;
    }

    private char[][] parsematrixs(List<String> m){
        char[][] matrixs=new char[m.size()][];
        for(int i=0;i<m.size();i++) matrixs[i]=m.get(i).toCharArray();
        return matrixs;
    }

}
